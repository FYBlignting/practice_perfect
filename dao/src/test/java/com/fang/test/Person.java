package com.fang.test;

import org.junit.Test;

import java.util.HashMap;


/**
 * @Auther: fang
 * @Date: 2018/12/15 04:49
 * @Description:
 */
public class Person {

    private String name;
    private int age;
    public Person(){
        this.name="小样";
        this.age=1;
    };

    public Person(String name,int age){
        this.name="小样";
        this.age=1;
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Test
    public void test1(){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<Object,Object>();
        objectObjectHashMap.put("张三",15);
    }
}
