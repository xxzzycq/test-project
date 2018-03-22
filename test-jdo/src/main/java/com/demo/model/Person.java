package com.demo.model;

/**
 * Created by yangchangqi on 2017/10/25.
 */

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.*;

@PersistenceCapable(detachable="true")
public class Person
{
    @PrimaryKey
    Long id;

    String name;

    public Person(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
