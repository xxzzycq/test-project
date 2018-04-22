package com.xxzzycq.thrift;

import com.xxzzycq.thrift.api.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;

import java.io.IOException;

/**
 * Created by yangchangqi on 2018/4/22.
 */
public class HelloServiceAsyncClient {
    /**
     * 调用HelloServiceAsyncServer的服务
     * @param args
     */
    public static void main(String[] args) {
        try {
            TAsyncClientManager clientManager = new TAsyncClientManager();
            TNonblockingTransport transport = new TNonblockingSocket("localhost", 10005);
            TProtocolFactory protocol = new TBinaryProtocol.Factory();
            // 生成客户端会话
            HelloService.AsyncClient asyncClient = new HelloService.AsyncClient(protocol, clientManager, transport);
            MethodCallback callback = new MethodCallback();
            // 调用服务端方法
            asyncClient.sayInt(666666, callback);
            Object res = callback.getResponse();
            while (res == null) {
                res = callback.getResponse();
                Thread.sleep(100);
            }
            System.out.println(((HelloService.AsyncClient.sayInt_call) res).getResult());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
