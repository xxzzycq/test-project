package com.xxzzycq.hive.metastore;

import org.apache.hadoop.hive.metastore.api.ThriftHiveMetastore;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransport;

import java.io.Closeable;

/**
 * Created by yangchangqi on 2018/3/21.
 */
public class HiveMetastoreClient extends ThriftHiveMetastore.Client implements Closeable {
    private final TTransport transport;

    public HiveMetastoreClient(TTransport transport) {
        super(new TBinaryProtocol(transport));
        this.transport = transport;
    }

    public HiveMetastoreClient(TProtocol protocol) {
        super(protocol);
        this.transport = protocol.getTransport();
    }

    @Override
    public void close() {
        transport.close();
    }
}
