package com.fang.inner;

import java.lang.reflect.Method;

/**
 * @Auther: fang
 * @Date: 2018/12/18 21:28
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
     interface innerMapper{
        public void test1();
        public void test2();
    }

    static class Outer{
        public void method(){
            innerMapper innerMapper = new innerMapper(){
                public void test1() {
                    System.out.println("test1");
                }

                public void test2() {
                    System.out.println("托尔斯泰");
                }
                //自定义方法
                public void test3(){
                    System.out.println("自定方法");
                }
            };
            innerMapper.test1();
            innerMapper.test2();
            //匿名内部类使用场景为,对于一个抽象方法调用比较简单,匿名内部类不存在向下转型,因为不存在子类的类名
            //innerMapper.test3();
        }
    }
}
