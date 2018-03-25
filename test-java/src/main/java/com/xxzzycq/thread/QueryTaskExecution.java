package com.xxzzycq.thread;

import com.xxzzycq.model.Person;
import com.xxzzycq.model.Sex;

import java.util.concurrent.Callable;

/**
 * Created by yangchangqi on 2018/3/25.
 */
public final class QueryTaskExecution implements Callable<Person> {
    String id;
    String name;
    String sex;
    String address;
    String mobile;

    public QueryTaskExecution(String id, String name, String sex, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.mobile = mobile;
    }

    @Override
    public Person call() throws Exception {
        Person person = new Person();
        person.setId(Integer.parseInt(id));
        person.setName(name);
        person.setAddress(address);
        person.setSex(Sex.valueOf(sex.toUpperCase()));
        person.setMobile(mobile);
        return person;
    }
}
