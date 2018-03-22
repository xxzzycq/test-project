package com.xxzzycq.thread;

/**
 * Created by yangchangqi on 2018/3/5.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("hello world");
        new Thread(task).start();
    }
}
