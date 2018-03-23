package com.xxzzycq.lambda.expression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by yangchangqi on 2018/3/23.
 */
public class LambdaWithMapExample {
    public static void main(String[] args) {
//        testForeach();
//        testGetOrDefault();
//        testPutIfAbsent();
//        testReplaceAll();
//        testMerge();
        testComputeIfAbsent();
        testComputeIfPresent();
    }

    /**
     * forEach()
     * 该方法签名为void forEach(BiConsumer<? super K,? super V> action)，作用是对Map中的每个映射执行action指定的操作，
     * 其中BiConsumer是一个函数接口，里面有一个待实现方法void accept(T t, U u)。
     * BinConsumer接口名字和accept()方法名字都不重要，请不要记忆他们。
     */
    public static void testForeach() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // Java7以及之前迭代Map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        // 使用forEach()结合匿名内部类迭代Map
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key + "=" + value);
            }
        });
        // 使用forEach()结合Lambda表达式迭代Map
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    /**
     * getOrDefault() 查询Map中指定的值，不存在时使用默认值
     * 该方法跟Lambda表达式没关系，但是很有用。方法签名为V getOrDefault(Object key, V defaultValue)，
     * 作用是按照给定的key查询Map中对应的value，如果没有找到则返回defaultValue。
     * 使用该方法程序员可以省去查询指定键值是否存在的麻烦．
     */

    public static void testGetOrDefault() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // Java7以及之前做法
        if (map.containsKey(4)) {
            System.out.println(map.get(4));
        } else {
            System.out.println("NoValue");
        }
        // Java8使用Map.getOrDefault()
        System.out.println(map.getOrDefault(4, "NoValue"));
    }

    /**
     * putIfAbsent()
     * 该方法跟Lambda表达式没关系，但是很有用。
     * 方法签名为V putIfAbsent(K key, V value)，作用是只有在不存在key值的映射或映射值为null时，才将value指定的值放入到Map中，否则不对Map做更改．
     * 该方法将条件判断和赋值合二为一，使用起来更加方便．
     */
    public static void testPutIfAbsent() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.putIfAbsent(4, "four");
        map.putIfAbsent(3, "3");
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    /**
     * replaceAll()
     * 该方法签名为replaceAll(BiFunction<? super K,? super V,? extends V> function)，
     * 作用是对Map中的每个映射执行function指定的操作，并用function的执行结果替换原来的value，
     * 其中BiFunction是一个函数接口，里面有一个待实现方法R apply(T t, U u)．
     * 不要被如此多的函数接口吓到，因为使用的时候根本不需要知道他们的名字．
     */
    public static void testReplaceAll() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // java7
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        map.forEach((k, v) -> System.out.println(k + "=" + v));
        // java8
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "one");
        map2.put(2, "two");
        map2.put(3, "three");
        map2.replaceAll((k, v) -> v.toUpperCase());
        map2.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    /**
     * testMerge()
     * 该方法签名为merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)，作用是：
     * 如果Map中key对应的映射不存在或者为null，则将value（不能是null）关联到key上；
     * 否则执行remappingFunction，如果执行结果非null则用该结果跟key关联，否则在Map中删除key的映射．
     * 参数中BiFunction函数接口前面已经介绍过，里面有一个待实现方法R apply(T t, U u)．
     */
    public static void testMerge() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.merge(2, "double", (k, v) -> "zhazha");
        map.merge(4, "double", (k, v) -> "zhazha");
        map.merge(1, "double", (k, v) -> null);
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    /**
     * testComputeIfAbsent()
     * 该方法签名为V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)，作用是：
     * 只有在当前Map中不存在key值的映射或映射值为null时，才调用mappingFunction，并在mappingFunction执行结果非null时，将结果跟key关联．
     * Function是一个函数接口，里面有一个待实现方法R apply(T t)．
     * computeIfAbsent()常用来对Map的某个key值建立初始化映射．
     */
    public static void testComputeIfAbsent() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.computeIfAbsent(2, v -> null);
        map.computeIfAbsent(4, v -> "double");
        map.computeIfAbsent(5, v -> null);
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    /**
     * testComputeIfPresent()
     * 该方法签名为V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)，
     * 作用跟computeIfAbsent()相反，即，只有在当前Map中存在key值的映射且非null时，才调用remappingFunction，
     * 如果remappingFunction执行结果为null，则删除key的映射，否则使用该结果替换key原来的映射．
     */
    public static void testComputeIfPresent() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.computeIfPresent(2, (k, v) -> null);
        map.computeIfPresent(3, (k, v) -> "double");
        map.computeIfPresent(4, (k, v) -> "double");
        map.computeIfPresent(null, (k, v) -> "double");
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
