package com.xxzzycq.dynamic.proxy;

/**
 * Created by yangchangqi on 2018/3/24.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
