package com.fang;

import java.lang.reflect.Field;

/**
 * @Auther: fang
 * @Date: 2018/12/14 19:01
 * @Description:需求:定义一个swap()方法,交换integer a=1,integer b =2 的值
 */
public class swap {
    //知识点:
    //1.java的传值方式:(1)引用传递(2)数值传递
    //2.反射机制
    //3.自动装箱拆箱
    //4.IntegerCache[-127~128]
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a=1; //自动装箱, 通过javap -c *可以查看jvm是怎么调用的
        Integer b=2;
        System.out.println("swap befor a="+a+" b="+b);
        swapMethod(a,b);
        System.out.println("swap befor a="+a+" b="+b);
    }

    private static void swapMethod(Integer num1, Integer num2) throws NoSuchFieldException, IllegalAccessException {
        int temp=num1;
       Field field= Integer.class.getDeclaredField("value");
       field.setAccessible(true);
       field.set(num1,num2);
       //field.setInt(num2,temp);
        field.set(num1,new Integer(temp));
    }

    ;
}
