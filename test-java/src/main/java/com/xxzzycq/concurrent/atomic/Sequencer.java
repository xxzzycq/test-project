package com.xxzzycq.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by yangchangqi on 2018/3/22.
 *
 * 线程安全的序列id生成器
 */
public class Sequencer {
    private final AtomicLong sequenceNumber = new AtomicLong(0);

    public long next() {
        return sequenceNumber.getAndIncrement();
    }

    public static void main(String[] args) {
        Sequencer sequencer1 = new Sequencer();
        Sequencer sequencer2 = new Sequencer();
        Runnable task1 = () -> {
            for(int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + sequencer1.next());
//                sleep(100);
            }
        };
        Runnable task2 = () -> {
            for(int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + sequencer2.next());
//                sleep(100);
            }
        };
        new Thread(task1, "序列1").start();
        new Thread(task2, "序列2").start();
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            // do nothing
        }
    }
}
