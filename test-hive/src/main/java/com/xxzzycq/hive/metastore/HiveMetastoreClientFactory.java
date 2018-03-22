package com.xxzzycq.hive.metastore;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import org.apache.hadoop.hive.thrift.client.TUGIAssumingTransport;
import org.apache.hadoop.security.SaslRpcServer;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.thrift.transport.TSaslClientTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import javax.security.sasl.Sasl;

import java.io.IOException;
import java.util.Map;

import static com.google.common.base.Preconditions.checkState;
import static org.apache.hadoop.security.SecurityUtil.getServerPrincipal;
import static org.apache.hadoop.security.SaslRpcServer.AuthMethod.KERBEROS;

/**
 * Created by yangchangqi on 2018/3/21.
 */
public class HiveMetastoreClientFactory {
    private final int timeoutMillis;

    public HiveMetastoreClientFactory(long timeout) {
        this.timeoutMillis = Ints.checkedCast(timeout);
    }

    private static TTransportException rewriteException(TTransportException e, String host) {
        return new TTransportException(e.getType(), String.format("%s: %s", host, e.getMessage()), e.getCause());
    }

    public HiveMetastoreClient create(String host, int port,
            UserGroupInformation ugi,
            boolean kdcAuthEnabled)
            throws TTransportException {
        return new HiveMetastoreClient(createTransport(host, port, ugi, kdcAuthEnabled));
    }

    protected TTransport createTransport(String host, int port, UserGroupInformation ugi, boolean kdcAuthEnabled)
            throws TTransportException {
        TSocket transport1 = new TSocket(host, port, timeoutMillis);
        TTransport transport;
        if (kdcAuthEnabled) {
            TTransport authenticatedTransport = createAuthenticatedTransport(transport1, "hive/_HOST@HADOOP.JD", host, ugi);
            transport = new TTransportWrapper(authenticatedTransport, host);
        } else {
            transport = new TTransportWrapper(transport1, host);
        }
        transport.open();
        return transport;
    }

    public TTransport createAuthenticatedTransport(TTransport rawTransport,
            String hiveMetastoreHostPrincipal,
            String host,
            UserGroupInformation ugi)
            throws TTransportException {
        try {
            String serverPrincipal = getServerPrincipal(hiveMetastoreHostPrincipal, host);
            System.out.println("hiveMetastoreHostPrincipal : " + serverPrincipal);
            String[] names = SaslRpcServer.splitKerberosName(serverPrincipal);
            checkState(names.length == 3,
                    "Kerberos principal name does NOT have the expected hostname part: %s", serverPrincipal);

            Map<String, String> saslProps = ImmutableMap.of(
                    Sasl.QOP, "auth",
                    Sasl.SERVER_AUTH, "true"
            );

            TTransport saslTransport = new TSaslClientTransport(
                    KERBEROS.getMechanismName(),
                    null,
                    names[0],
                    names[1],
                    saslProps,
                    null,
                    rawTransport);
            return new TUGIAssumingTransport(saslTransport, ugi);
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    private static class TTransportWrapper
            extends TTransport {
        private final TTransport transport;
        private final String host;

        TTransportWrapper(TTransport transport, String host) {
            this.transport = transport;
            this.host = host;
        }

        @Override
        public boolean isOpen() {
            return transport.isOpen();
        }

        @Override
        public boolean peek() {
            return transport.peek();
        }

        @Override
        public byte[] getBuffer() {
            return transport.getBuffer();
        }

        @Override
        public int getBufferPosition() {
            return transport.getBufferPosition();
        }

        @Override
        public int getBytesRemainingInBuffer() {
            return transport.getBytesRemainingInBuffer();
        }

        @Override
        public void consumeBuffer(int len) {
            transport.consumeBuffer(len);
        }

        @Override
        public void close() {
            transport.close();
        }

        @Override
        public void open()
                throws TTransportException {
            try {
                transport.open();
            } catch (TTransportException e) {
                throw rewriteException(e, host);
            }
        }

        @Override
        public int readAll(byte[] bytes, int off, int len)
                throws TTransportException {
            try {
                return transport.readAll(bytes, off, len);
            } catch (TTransportException e) {
                throw rewriteException(e, host);
            }
        }

        @Override
        public int read(byte[] bytes, int off, int len)
                throws TTransportException {
            try {
                return transport.read(bytes, off, len);
            } catch (TTransportException e) {
                throw rewriteException(e, host);
            }
        }

        @Override
        public void write(byte[] bytes)
                throws TTransportException {
            try {
                transport.write(bytes);
            } catch (TTransportException e) {
                throw rewriteException(e, host);
            }
        }

        @Override
        public void write(byte[] bytes, int off, int len)
                throws TTransportException {
            try {
                transport.write(bytes, off, len);
            } catch (TTransportException e) {
                throw rewriteException(e, host);
            }
        }

        @Override
        public void flush()
                throws TTransportException {
            try {
                transport.flush();
            } catch (TTransportException e) {
                throw rewriteException(e, host);
            }
        }
    }
}
