package com.xxzzycq.thrift;

import com.xxzzycq.thrift.api.HelloService;
import org.apache.thrift.TException;

/**
 * Created by yangchangqi on 2018/4/22.
 *
 * https://www.ibm.com/developerworks/cn/java/j-lo-apachethrift/
 * 编写真正业务逻辑实现类
 */
public class HelloServiceImpl implements HelloService.Iface {
    @Override
    public int sayInt(int param) throws TException {
        System.out.println("call say int...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return param;
    }

    @Override
    public String sayString(String param) throws TException {
        System.out.println("call say string...");
        return param;
    }

    @Override
    public boolean sayBool(boolean param) throws TException {
        System.out.println("call say bool ...");
        return param;
    }

    @Override
    public void sayVoid() throws TException {
        System.out.println("call say void...");
    }
}
