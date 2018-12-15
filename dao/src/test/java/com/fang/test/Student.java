package com.fang.test;

import org.junit.Test;

/**
 * @Auther: fang
 * @Date: 2018/12/15 05:11
 * @Description:
 */
public class Student extends Person{
    public Student() {

    }

    @Test
    public void test1(){
        Person person = new Person();
        Student student = new Student();
        System.out.println(student instanceof Person);
    }
}
