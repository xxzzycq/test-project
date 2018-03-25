package com.xxzzycq.thread;

import com.xxzzycq.model.Person;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public class CallableDemo {
    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        ExecuteThreadService executeThreadService = new ExecuteThreadServiceImpl();
        QueryTaskExecution execution = new QueryTaskExecution("1111", "张三", "MALE", "深圳", "12222222222");
        Future<Person> future = executeThreadService.submitListenCall(execution);
        System.out.println(future.get());
    }
}
