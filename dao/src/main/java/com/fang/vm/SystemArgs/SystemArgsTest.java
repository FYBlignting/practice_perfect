package com.fang.vm.SystemArgs;

import java.util.Properties;

/**
 * @Auther: fang
 * @Date: 2018/12/24 22:22
 * @Description:
 */
public class SystemArgsTest {
    public static void main(String[] args) {
        String str = System.getProperty("str");
        if(str!=null){
            System.out.println(str);
        }else{
            System.out.println("itcast");
        }
    }
}
