package com.xxzzycq.thrift;

import com.xxzzycq.thrift.api.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by yangchangqi on 2018/4/22.
 */
public class HelloServiceClient {
    public static void main(String[] args) {
        try {
            // 设置调用的服务地址为本地，端口为 7911
            TTransport transport = new TSocket("localhost", 7911);
            // 设置传输协议为 TBinaryProtocol
            TProtocol protocol = new TBinaryProtocol(transport);
            // 生成客户端会话
            HelloService.Client client = new HelloService.Client(protocol);
            // 打开socket
            transport.open();
            // 调用服务端方法
            int num = client.sayInt(666666);
            System.out.println(num);
            boolean flag = client.sayBool(true);
            System.out.println(flag);
            String str = client.sayString("Hello World");
            System.out.println(str);
            client.sayVoid();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
