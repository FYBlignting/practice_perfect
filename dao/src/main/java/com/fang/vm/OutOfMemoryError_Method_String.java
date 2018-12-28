package com.fang.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: fang
 * @Date: 2018/12/22 23:30
 * @Description:方法区常量池内存溢出
 * -XX:PermSize=10M
 * -XX:MaxPerSize=10M
 */
public class OutOfMemoryError_Method_String {
    public static void main(String[] args) {
        int i=0;
        //使用List保持常量池引用,防止池行为
        List<String> list=new ArrayList<String>();
        while (true){
            list.add(String.valueOf(i++));
        }
    }
}
