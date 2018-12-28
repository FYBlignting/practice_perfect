package com.fang.vm;

/**
 * @Auther: fang
 * @Date: 2018/12/22 23:16
 * @Description:栈内存无法申请更多的空间,内存溢出
 * VM args -Xss2M
 */
public class OutOfMemoryError_Stack {

    public static void main(String[] args) {
        StackLeakThread();
    }

    public static void dontStop(){
        while (true){

        }
    }

    public static void StackLeakThread(){
        while (true){
            new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            }).start();
        }

    }
}
