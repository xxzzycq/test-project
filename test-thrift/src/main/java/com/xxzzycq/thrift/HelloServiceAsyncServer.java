package com.xxzzycq.thrift;

import com.xxzzycq.thrift.api.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by yangchangqi on 2018/4/22.
 */
public class HelloServiceAsyncServer {
    /**
     * 启动 Thrift 异步服务器
     * @param args
     */
    public static void main(String[] args) {
        TNonblockingServerTransport transport;
        try {
            // 设置服务端端口
            transport = new TNonblockingServerSocket(10005);
            // 设置二进制协议工厂
            TBinaryProtocol.Factory protocol = new TBinaryProtocol.Factory();
            // 处理器关联业务实现
            TProcessor processor = new HelloService.Processor<>(new HelloServiceImpl());
            // 定义server类型 多线程服务器端使用非阻塞式 I/O
            TNonblockingServer.Args params = new TNonblockingServer.Args(transport).protocolFactory(protocol).processor(processor);
            TServer server = new TNonblockingServer(params);
            // 开启服务
            System.out.println("Start server on port 10005 ...");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
