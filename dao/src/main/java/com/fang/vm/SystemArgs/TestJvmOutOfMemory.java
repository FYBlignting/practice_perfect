package com.fang.vm.SystemArgs;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @Auther: fang
 * @Date: 2018/12/27 13:05
 * @Description:
 */
public class TestJvmOutOfMemory {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <1000000 ; i++) {
            String str="";
            for (int j = 0; j <1000 ; j++) {
                str+= UUID.randomUUID().toString();
            }
            list.add(str);
        }
        System.out.println("添加成功");
    }
}
