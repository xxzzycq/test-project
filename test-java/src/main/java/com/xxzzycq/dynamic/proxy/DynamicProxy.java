package com.xxzzycq.dynamic.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by yangchangqi on 2018/3/24.
 */
public class DynamicProxy {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new ProxyHandler(realSubject));
        subject.doSomething();
    }
}