package com.xxzzycq.thread;

/**
 * Created by yangchangqi on 2018/3/5.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        ExecuteThreadService executeThreadService = new ExecuteThreadServiceImpl();
        Runnable task = () -> System.out.println("runnable is starting");
//        new Thread(task).start();
        executeThreadService.executeThread(task);
    }
}
