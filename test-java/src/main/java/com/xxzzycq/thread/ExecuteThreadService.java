package com.xxzzycq.thread;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public interface ExecuteThreadService {
    void executeThread(Runnable runnable);

    <T> ListenableFuture<T> submitListenCall(Callable<T> callable);

    ExecutorService getExecutor();
}
