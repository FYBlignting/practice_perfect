package com.fang.test;

import org.junit.Test;

/**
 * @Auther: fang
 * @Date: 2018/12/23 16:54
 * @Description:
 */
public class PersonTest {
    @Test
    public void test1(){
        Person person = new Person();
        person.setName("张三");
        person.setAge(10);
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(10);
        boolean equals = person.equals(person1);
        System.out.println(person+"------"+equals);

    }
}
