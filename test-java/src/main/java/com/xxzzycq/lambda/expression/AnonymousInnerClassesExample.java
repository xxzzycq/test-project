package com.xxzzycq.lambda.expression;

import com.xxzzycq.model.Person;
import com.xxzzycq.model.Sex;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yangchangqi on 2018/3/
 *
 * 能够使用Lambda的依据是必须有相应的函数接口（函数接口，是指内部只有一个抽象方法的接口）。
 * 这一点跟Java是强类型语言吻合，也就是说你并不能在代码的任何地方任性的写Lambda表达式。
 * 实际上Lambda的类型就是对应函数接口的类型。
 * Lambda表达式另一个依据是类型推断机制，在上下文信息足够的情况下，编译器可以推断出参数表的类型，而不需要显式指名。
 *
 */
public class AnonymousInnerClassesExample {
    public static void main(String[] args) {
        // 没有参数的匿名类
        Runnable task = () -> {
            String str = "没有参数的匿名类";
            System.out.println(str);
        };
        new Thread(task).start();

        // 一个参数的匿名类
        ActionListener listener = event -> System.out.println("button clicked");
        new Button().addActionListener(listener);

        // 两个参数的匿名类
        Person p1 = new Person(1, "zhangsan", Sex.MALE, "北京", "110");
        Person p2 = new Person(2, "lisi", Sex.MALE, "北京", "110");
        Person p3 = new Person(3, "wangwu", Sex.MALE, "北京", "110");
        Person p4 = new Person(4, "zhangliu", Sex.MALE, "北京", "110");
        List<Person> people = Arrays.asList(p1, p2, p3, p4);
        Collections.sort(people, (o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 1) {
                return 1;
            } else {
                return -1;
            }
        });
        people.stream().map(Person::getName).forEach(System.out::println);
        people.stream().map(person -> person.getClass().getClassLoader()).forEach(System.out::println);
        people.parallelStream().map(Person::getId).map(i -> i + 0).filter(i -> i < 10).forEach(id -> System.out.println(id));
        int sum = people.parallelStream().map(Person::getId).reduce((x, y) -> (x + y)).get();
        System.out.println(sum);

        // 自定义函数接口
        //invoke doSomeWork using Annonymous class
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker invoked using Anonymous class");
            }
        });

        //invoke doSomeWork using Lambda expression
        execute(() -> System.out.println("Worker invoked using Lambda expression"));
    }

    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }
}
