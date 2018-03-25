package com.xxzzycq.thread;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by yangchangqi on 2018/3/25.
 *
 * 执行线程
 */
public class ExecuteThreadServiceImpl implements ExecuteThreadService {
    ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("test-java-execute-thread-%d").build();
    /**
     * 说明：初始化一个指定线程数的线程池，其中corePoolSize == maxiPoolSize，使用LinkedBlockingQuene作为阻塞队列
     * 特点：即使当线程池没有可执行任务时，也不会释放线程。
     */
    private final ExecutorService threadPool = Executors.newFixedThreadPool(10, threadFactory);
//    private final ExecutorService threadPool = Executors.newFixedThreadPool(10, Executors.defaultThreadFactory());

    /**
     * 说明：初始化一个可以缓存线程的线程池，默认缓存60s，线程池的线程数可达到Integer.MAX_VALUE，即2147483647，内部使用SynchronousQueue作为阻塞队列；
     * 特点：在没有任务执行时，当线程的空闲时间超过keepAliveTime，会自动释放线程资源；当提交新任务时，如果没有空闲线程，则创建新线程执行任务，会导致一定的系统开销；
     *      因此，使用时要注意控制并发的任务数，防止因创建大量的线程导致而降低性能。
     */
    private final ExecutorService threadPool2 = Executors.newCachedThreadPool(threadFactory);

    /**
     * 说明：初始化只有一个线程的线程池，内部使用LinkedBlockingQueue作为阻塞队列。
     * 特点：如果该线程异常结束，会重新创建一个新的线程继续执行任务，唯一的线程可以保证所提交任务的顺序执行
     */
    private final ExecutorService threadPool3 = Executors.newSingleThreadExecutor(threadFactory);

    /**
     * 特定：初始化的线程池可以在指定的时间内周期性的执行所提交的任务，在实际的业务场景中可以使用该线程池定期的同步数据。
     */
    private final ExecutorService threadPool4 = Executors.newScheduledThreadPool(10, threadFactory);

    private final ListeningExecutorService listeningExecutor = MoreExecutors.listeningDecorator(threadPool);

    @Override
    public void executeThread(Runnable runnable) {
        threadPool.execute(runnable);
    }

    @Override
    public <T> ListenableFuture<T> submitListenCall(Callable<T> callable) {
        return listeningExecutor.submit(callable);
    }

    @Override
    public ExecutorService getExecutor() {
        return threadPool;
    }

    public void close() {
        if (threadPool != null) {
            threadPool.shutdown();
        }
        if (listeningExecutor != null) {
            listeningExecutor.shutdown();
        }
    }
}
