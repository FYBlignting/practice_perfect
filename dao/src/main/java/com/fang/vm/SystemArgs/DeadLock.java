package com.fang.vm.SystemArgs;

/**
 * @Auther: fang
 * @Date: 2018/12/27 18:05
 * @Description:
 */
public class DeadLock {
    private static Object obj1=new Object();
    private static Object obj2=new Object();
    public static void main(String[] args) {

    }

    private static class Thread1 implements Runnable{

        public void run() {
            synchronized (obj1){
                System.out.println("Thread1拿到了obj1锁");
            }
            try {
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println("Thread1拿到obj2锁");
            }
        }
    }

    private static class Thread2 implements Runnable{

        public void run() {
            synchronized (obj2){
                System.out.println("Thread2拿到了obj2锁");
            }
            try {
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
            synchronized (obj1){
                System.out.println("Thread2拿到obj1锁");
            }
        }
    }
}

