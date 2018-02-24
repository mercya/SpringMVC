package com.springmvc.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by eCRF on 2018/2/24.
 */
public class Set2 {

    public static Set fill(Set a,int size){
        for (int i=0;i<size;i++){
            a.add(new MyType(i));
        }
        return a;
    }
    public static Set fill(Set a){
        return fill(a,10);
    }
    public static void test(Set a){
        //添加了3次
        fill(a);
        fill(a);
        fill(a);
        a.addAll(fill(new TreeSet()));
        System.out.println(a);
    }
    public static void main(String[] args){
        test(new HashSet());
        test(new TreeSet());

    }
}
