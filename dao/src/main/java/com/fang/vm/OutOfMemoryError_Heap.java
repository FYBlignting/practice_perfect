package com.fang.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: fang
 * @Date: 2018/12/20 15:43
 * @Description:
 */
public class OutOfMemoryError_Heap {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
