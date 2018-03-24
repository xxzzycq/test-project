package com.xxzzycq.lambda.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by yangchangqi on 2018/3/23.
 */
public class LambdaWithCollectionExample {
    public static void main(String[] args) {
//        testForeach();
//        testRemoveIf();
//        testReplaceAll();
//        testSort();
    }

    /**
     * foreach()
     * 该方法的签名为void forEach(Consumer<? super E> action)，作用是对容器中的每个元素执行action指定的动作，
     * 其中Consumer是个函数接口，里面只有一个待实现方法void accept(T t)
     * （后面我们会看到，这个方法叫什么根本不重要，你甚至不需要记忆它的名字）。
     */
    public static void testForeach() {
        List<String> list = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        // 使用增强for循环迭代
        for (String str : list) {
            if (str.length() > 6)
                System.out.println(str);
        }
        // 使用forEach()结合匿名内部类迭代
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                if (str.length() > 6)
                    System.out.println(str);
            }
        });
        // 使用forEach()结合Lambda表达式迭代
        list.forEach(str -> {
            if (str.length() > 6)
                System.out.println(str);
        });
    }

    /**
     * removeIf()
     * 该方法签名为boolean removeIf(Predicate<? super E> filter)，作用是删除容器中所有满足filter指定条件的元素，
     * 其中Predicate是一个函数接口，里面只有一个待实现方法boolean test(T t)，
     * 同样的这个方法的名字根本不重要，因为用的时候不需要书写这个名字。
     */
    public static void testRemoveIf() {
        List<String> list = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        // 使用迭代器删除列表元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 5)
                it.remove();
        }
        // 使用removeIf()结合匿名名内部类实现
        List<String> list2 = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        list2.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });
        // 使用removeIf()结合Lambda表达式实现
        List<String> list3 = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        list3.removeIf(str -> str.length() > 5);
    }

    /**
     * replaceAll()
     * 该方法签名为void replaceAll(UnaryOperator<E> operator)，作用是对每个元素执行operator指定的操作，并用操作结果来替换原来的元素。
     * 其中UnaryOperator是一个函数接口，里面只有一个待实现函数T apply(T t)
     */
    public static void testReplaceAll() {
        List<String> list = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        // 使用下标实现元素替换
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() > 5)
                list.set(i, str.toUpperCase());
        }
        list.forEach(System.out::println);
        // 使用匿名内部类实现
        List<String> list2 = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        list2.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.length() > 5)
                    return s.toUpperCase();
                return s;
            }
        });
        list2.stream().forEach(System.out::println);
        // 使用Lambda表达式实现
        List<String> list3 = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        list3.replaceAll(str -> {
            if (str.length() > 5)
                return str.toUpperCase();
            return str;
        });
        list3.forEach(str -> System.out.print(str + "\t"));
    }

    /**
     * sort()
     * 该方法定义在List接口中，方法签名为void sort(Comparator<? super E> c)，该方法根据c指定的比较规则对容器元素进行排序。
     * Comparator接口我们并不陌生，其中有一个方法int compare(T o1, T o2)需要实现，显然该接口是个函数接口。
     */
    public static void testSort() {
        // 采用Collections.sort
        List<String> list = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        list.forEach(s -> System.out.print(s + "\t"));
        // List.sort()方法结合Lambda表达式
        List<String> list2 = new ArrayList<>(Arrays.asList("zhangsan", "lisi", "wangwu", "zhangliu", "xiaoming"));
        list2.sort((str1, str2) -> str1.length() - str2.length());
        list2.forEach(s -> System.out.print(s + "\t"));
    }

    /**
     * spliterator()
     * 方法签名为Spliterator<E> spliterator()，该方法返回容器的可拆分迭代器。
     * 从名字来看该方法跟iterator()方法有点像，我们知道Iterator是用来迭代容器的，Spliterator也有类似作用，但二者有如下不同：

     * Spliterator既可以像Iterator那样逐个迭代，也可以批量迭代。批量迭代可以降低迭代的开销。
     * Spliterator是可拆分的，一个Spliterator可以通过调用Spliterator<T> trySplit()方法来尝试分成两个。
     * 一个是this，另一个是新返回的那个，这两个迭代器代表的元素没有重叠。
     * 可通过（多次）调用Spliterator.trySplit()方法来分解负载，以便多线程处理。
     */

}
