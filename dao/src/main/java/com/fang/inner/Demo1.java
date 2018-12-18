package com.fang.inner;

/**
 * @Auther: fang
 * @Date: 2018/12/18 21:09
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.methos();
    }
}


interface InnerMapper{
    public void test();
}

class Outer{
    class Inner implements InnerMapper{
        public void test() {
            System.out.println("你好呀");
        }
    }
    public void methos(){
       /* Inner inner = new Inner();
        inner.test();*/
       new InnerMapper(){
           public void test() {
               System.out.println("我是匿名内部类");
           }
       }.test();
    }
}
