package com.xxzzycq.concurrent.atomic;

import com.xxzzycq.model.Person;
import com.xxzzycq.model.Sex;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * Created by yangchangqi on 2018/3/22.
 *
 * 实现全局自增id最简单有效的方式是什么？java.util.concurrent.atomic包定义了一些常见类型的原子变量。
 * 这些原子变量为我们提供了一种操作单一变量无锁(lock-free)的线程安全(thread-safe)方式。
 * 实际上该包下面的类为我们提供了类似volatile变量的特性，同时还提供了诸如boolean compareAndSet(expectedValue, updateValue)的功能。
 * 不使用锁实现线程安全听起来似乎很不可思议，这其实是通过CPU的compare and swap指令实现的，由于硬件指令支持当然不需要加锁了。
 *
 * 线程安全是指多线程访问是时，无论线程的调度策略是什么，程序能够正确的执行。
 * 导致线程不安全的一个原因是状态不一致，如果线程A修改了某个共享变量（比如给id++），而线程B没有及时知道，就会导致B在错误的状态上执行，结果的正确性也就无法保证。
 * 原子变量为我们提供了一种保证单个状态一致的简单方式，一个线程修改了原子变量，另外的线程立即就能看到，这比通过锁实现的方式效率要高；如果要同时保证多个变量状态一致，就只能使用锁了。
 */
public class AtomicExample {
    // test AtomicInteger
    public static final AtomicInteger count = new AtomicInteger();
    public static final AtomicInteger count2 = new AtomicInteger();

    // test AtomicBoolean
    public static final AtomicBoolean flag = new AtomicBoolean();
    public static final AtomicBoolean flag2 = new AtomicBoolean(false);

    // test AtomicReference
    public static final AtomicReference<Person> reference = new AtomicReference();

    // test atomic array
    public static final AtomicIntegerArray IntergerArray = new AtomicIntegerArray(10);
    public static final AtomicReferenceArray<Person> referenceArray = new AtomicReferenceArray(10);

    public static void main(String[] args) {
        // // test AtomicInteger
        new AtomicExample().testAtomicInteger();
        new AtomicExample().testAtomicInteger();
        new AtomicExample().testAtomicInteger();

        // test AtomicBoolean
        new AtomicExample().testAtomicBoolean();

        // test AtomicReference
        new AtomicExample().testAtomicReference();
    }

    public void testAtomicInteger() {
        System.out.println(count.get());
        System.out.println(count2.decrementAndGet());
        // 先比较是否相等，相等就修改，不相等就不修改
        System.out.println(count2.compareAndSet(1, 1));
        System.out.println(count2.get());
        Thread t1 = getAtomicIntegerThread(count);
        Thread t2 = getAtomicIntegerThread(count);
        t1.start();
        t2.start();
    }

    public void testAtomicBoolean() {
        System.out.println(flag.get());
        System.out.println(flag2.getAndSet(true));
        System.out.println(flag2.get());
        System.out.println(flag2.compareAndSet(true, false));
        System.out.println(flag2.get());
        flag2.lazySet(true);
        System.out.println(flag2.get());
    }

    public void testAtomicReference() {
        reference.set(new Person(1000, "杨长琪", Sex.MALE, "北辰世纪中心", "13823778712"));
        Thread t3 = getAtomicReferenceThread(reference);
        Thread t4 = getAtomicReferenceThread(reference);
        Thread t5 = getAtomicReferenceThread(reference);
        t4.start();
        t5.start();
        t3.start();
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            // do nothing
        }
    }

    private static Thread getAtomicIntegerThread(AtomicInteger count) {
        return new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(count.getAndIncrement());
                sleep(50);
            }});
    }

    private static Thread getAtomicReferenceThread(AtomicReference<Person> reference) {
        return new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                reference.get().setId(reference.get().getId() + 1);
                sleep(50);
                System.out.println(reference.get().getId());
            }});
    }
}
