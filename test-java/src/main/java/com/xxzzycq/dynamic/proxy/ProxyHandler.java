package com.xxzzycq.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangchangqi on 2018/3/24.
 */
public class ProxyHandler implements InvocationHandler {
    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        //在转调具体目标对象之前，可以执行一些功能处理
        // do nothing

        return method.invoke(proxied, args);

        //在转调具体目标对象之后，可以执行一些功能处理
        //do nothing
    }
}
