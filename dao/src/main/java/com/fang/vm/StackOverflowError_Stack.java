package com.fang.vm;

/**
 * @Auther: fang
 * @Date: 2018/12/22 22:37
 * @Description:栈帧深度:栈帧的高度
 * 局部变量越多,传入的参数越多,占用的内存越大,栈帧的深度越小
 */
public class StackOverflowError_Stack {
    private static int stackLength=1;

    public static void main(String[] args) throws Throwable {
        try {
            //stackLeak();
            //stackLeak1(1,1,1);
            stackLeak2(1,1,1);
        }catch (Throwable e){
            System.out.println("stackLength="+stackLength);
            throw e;
        }
    }

    public static void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void stackLeak1(int a,int b,int c){
        stackLength++;
        stackLeak1(1,1,1);
    }

    public static void stackLeak2(int a,int b,int c){
        int d=0;
        long h=9l;
        stackLength++;
        stackLeak2(1,1,1);
    }
}

