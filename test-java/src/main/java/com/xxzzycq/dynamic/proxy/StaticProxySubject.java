package com.xxzzycq.dynamic.proxy;


/**
 * Created by yangchangqi on 2018/3/24.
 * java static proxy
 */
public class StaticProxySubject implements Subject {
    private Subject subject = new RealSubject();

    @Override
    public void doSomething() {
        subject.doSomething();
    }

    public static void main(String[] args) {
        new StaticProxySubject().doSomething();
    }
}


