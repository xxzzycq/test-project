package com.xxzzycq.stream.api;

import com.xxzzycq.model.Sex;
import com.xxzzycq.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yangchangqi on 2018/3/23.
 */
public class StreamApiExample {
    public static void main(String[] args) {
//        testFilter();
//        testMap();
//        testFlatmap();
//        testSortAndDistinct();
//        testReduce();
        testCollect();
    }


    //TODO test filter and foreach
    public static void testFilter() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
    }

    /**
     * test map
     * 函数原型为<R> Stream<R> map(Function<? super T,? extends R> mapper)，
     * 作用是返回一个对当前所有元素执行执行mapper之后的结果组成的Stream。
     * 直观的说，就是对每个元素按照某种操作进行转换，转换前后Stream中元素的个数不会改变，但元素的类型取决于转换之后的类型。
     */
    public static void testMap() {
        Stream<String> stream2 = Stream.of("I", "love", "you", "too");
        stream2.map(s -> s.toUpperCase()).forEach(System.out::println);
    }

    /**
     * test flatmap
     * 函数原型为<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)，
     * 作用是对每个元素执行mapper指定的操作，并用所有mapper返回的Stream中的元素组成一个新的Stream作为最终返回结果。
     * 说起来太拗口，通俗的讲flatMap()的作用就相当于把原stream中的所有元素都"摊平"之后组成的Stream，转换前后元素的个数和类型都可能会改变。
     */
    public static void testFlatmap() {
        Stream<List<Integer>> stream3 = Stream.of(Arrays.asList(1 ,2), Arrays.asList(3, 4, 5), Arrays.asList(3, 5, 6));
        stream3.flatMap(list -> list.stream().map(x -> x + 100)).forEach(num -> System.out.println(num));
    }

    //TODO sorted and distinct
    public static void testSortAndDistinct() {
        Stream<String> stream4 = Stream.of("I", "love", "you", "too");
        stream4.distinct().sorted((str1, str2) -> str1.compareTo(str2)).forEach(System.out::println);
    }

    /**
     * test reduce()
     * reduce操作可以实现从一组元素中生成一个值，sum()、max()、min()、count()等都是reduce操作，将他们单独设为函数只是因为常用。
     * reduce()的方法定义有三种重写形式：
     * Optional<T> reduce(BinaryOperator<T> accumulator)
     * T reduce(T identity, BinaryOperator<T> accumulator)
     * <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
     * 虽然函数定义越来越长，但语义不曾改变，多的参数只是为了指明初始值（参数identity），或者是指定并行执行时多个部分结果的合并方式（参数combiner）。
     * reduce()最常用的场景就是从一堆值中生成一个值。
     */
    public static void testReduce() {
        Stream<String> stream5 = Stream.of("I", "love", "you", "too");
        Optional<String> max = stream5.reduce((s, s2) -> s.length() - s2.length() > 0 ? s : s2);
        System.out.println(max.get());
//        Optional<String> max2 = stream5.max((s1, s2) -> s1.length() - s2.length());
//        System.out.println(max2.get());

        Stream<String> stream6 = Stream.of("I", "love", "you", "too");
        Integer lengthSum = stream6.reduce(0, // 初始值
                (sum, str) -> sum + str.length(), // 累加器
                (a, b) -> a + b); // 部分和拼接器，并行执行时才会用到
        System.out.println(lengthSum);
        //        int lengthSum2 = stream6.mapToInt(str -> str.length()).sum();
//        System.out.println(lengthSum2);
    }

    /**
     * test collect()
     */
    public static void testCollect() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        // 将Stream转换成容器或Map
//        List<String> list = stream.collect(Collectors.toList());
//        Set<String> set = stream.collect(Collectors.toSet());
        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(),//如何生成key
                                                                   String::length)); //如何生成value

        /**
         * 将Stream规约成List
         * 收集器（Collector）是为Stream.collect()方法量身打造的工具接口（类）。
         * 考虑一下将一个Stream转换成一个容器（或者Map）需要做哪些工作？我们至少需要两样东西：
         * 目标容器是什么？是ArrayList还是HashSet，或者是个TreeMap。
         * 新元素如何添加到容器中？是List.add()还是Map.put()。
         */
        Stream<String> stream2 = Stream.of("I", "love", "you", "too");
//        List<String> list2 = stream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        List<String> list2 = stream2.collect(Collectors.toList());
        Set<String> set2 = stream2.collect(HashSet::new, HashSet::add, HashSet::addAll);
//        System.out.println(list2);

        /**
         * 使用Collectors.toCollection()指定规约容器的类型
         * 上面例子由于返回结果是接口类型，我们并不知道类库实际选择的容器类型是什么，有时候我们可能会想要人为指定容器的实际类型，
         * 这个需求可通过Collectors.toCollection(Supplier<C> collectionFactory)方法完成。
         */
        Stream<String> stream3 = Stream.of("I", "love", "you", "too");
        List<String> list3 = stream3.collect(Collectors.toCollection(LinkedList::new));
        System.out.println(list3);

        // test join
        Stream<String> stream4 = Stream.of("I", "love", "you", "too");
//        String joined = stream4.collect(Collectors.joining());
        String joined = stream4.collect(Collectors.joining(","));
//        String joined = stream4.collect(Collectors.joining(",", "", "."));
        System.out.println(joined);

        /**
         * 使用collect()生成Map
         * 前面已经说过Stream背后依赖于某种数据源，数据源可以是数组、容器等，但不能是Map。
         * 反过来从Stream生成Map是可以的，但我们要想清楚Map的key和value分别代表什么，根本原因是我们要想清楚要干什么。
         * 通常在三种情况下collect()的结果会是Map：
         * 使用Collectors.toMap()生成的收集器，用户需要指定如何生成Map的key和value。
         * 使用Collectors.partitioningBy()生成的收集器，对元素进行二分区操作时用到。
         * 使用Collectors.groupingBy()生成的收集器，对元素做group操作时用到。
         */
        Student s1 = new Student(1, "zhangsan", Sex.FEMALE, 20, "1班");
        Student s2 = new Student(2, "lisi", Sex.MALE, 20, "1班");
        Student s3 = new Student(3, "wangwu", Sex.FEMALE, 20, "2班");
        Student s4 = new Student(4, "zhangsan", Sex.MALE, 20, "2班");
        Student s5 = new Student(5, "zhangsan", Sex.FEMALE, 20, "1班");
        Student s6 = new Student(6, "zhangsan", Sex.MALE, 20, "1班");
        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
        // 计算每个班级的有哪些人
        Map<String, List<String>> byGrage = students.stream().collect(Collectors.groupingBy(Student::getGrade,
                                                                          Collectors.mapping(s -> s.getName(), // 下游收集器
                                                                              Collectors.toList()))); // 更下游收集器
        byGrage.forEach((k, v) -> System.out.println(k + "=" + v));
        //
//        Map<Sex, List<Student>> bySex = students.stream().collect(Collectors.groupingBy(s -> s.getSex()));
//        bySex.forEach((k, v) -> System.out.println(k + "=" + v));

    }
}
