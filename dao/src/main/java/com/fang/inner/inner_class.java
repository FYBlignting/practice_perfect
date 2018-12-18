package com.fang.inner;

import sun.applet.Main;

import java.lang.reflect.Method;

/**
 * @Auther: fang
 * @Date: 2018/12/18 20:30
 * @Description:
 */
public class inner_class {
    public static void main(String[] args){
        /*outer.inner.metthod();*/
       /* outer outer=new outer();
        outer.method();*/
       outer.inner oi=new outer().new inner();
       oi.method();
    }
}
class outer{
    int num=10;
    class inner{
        int num=20;
        public void method(){
            int num=30;
            System.out.println("方法内num="+num);
            System.out.println("inner中的num="+this.num);
            System.out.println("outer中的num="+outer.this.num);
        }
    }
}
/*class outer{
    int num=10;
   public void method(){
       //内部类相当于局部变量,要调用innerMethod方法,必须在method方法里面就进行调用
       //使用final修饰,就是将局部变量变成常量,num在常量池中,延迟num的生命周期
       final int num=10;
       class inner{
           public void innerMethod(){
               System.out.println("你好"+num);
           }
       }
       inner inner = new inner();
       inner.innerMethod();
   }
}*/
/*class outer{
    //成员变量
    static class inner{
    public static void metthod(){
        System.out.println("你好");
    }
}
}*/
