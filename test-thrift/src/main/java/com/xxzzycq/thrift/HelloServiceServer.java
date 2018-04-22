package com.xxzzycq.thrift;

import com.xxzzycq.thrift.api.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by yangchangqi on 2018/4/22.
 */
public class HelloServiceServer {
    /**
     * 启动 Thrift 服务器
     * @param args
     */
    public static void main(String[] args) {
        try {
            // 设置服务端端口
            TServerTransport transport = new TServerSocket(7911);
            // 设置二进制协议工厂
            TBinaryProtocol.Factory factory = new TBinaryProtocol.Factory();
            // 处理器关联业务实现
            TProcessor processor = new HelloService.Processor<>(new HelloServiceImpl());
            // 定义server类型 多线程服务器端使用标准的阻塞式 I/O
            TThreadPoolServer.Args params = new TThreadPoolServer.Args(transport).protocolFactory(factory).processor(processor);
            TServer server = new TThreadPoolServer(params);
            // 开启server
            System.out.println("Start server on port 7911...");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException te) {
            te.printStackTrace();
        }
    }
}
