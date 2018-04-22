package com.xxzzycq.thrift;

import org.apache.thrift.async.AsyncMethodCallback;

/**
 * Created by yangchangqi on 2018/4/22.
 *
 * onComplete 方法接收服务处理后的结果，此处我们将结果 response 直接赋值给 callback 的私有属性 response。
 * onError 方法接收服务处理过程中抛出的异常，此处未对异常进行处理
 */
public class MethodCallback implements AsyncMethodCallback {
    private Object response = null;

    public Object getResponse() {
        return response;
    }

    @Override
    public void onComplete(Object response) {
        this.response = response;
    }

    @Override
    public void onError(Exception e) {
        e.printStackTrace();
    }
}
