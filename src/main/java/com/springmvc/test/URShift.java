package com.springmvc.test;

/**
 * Created by eCRF on 2018/3/7.
 */
public class URShift {
    public static void main(String[] args){
        int i=-1;
        i>>>=10;
        System.out.println(i);
        long l=-1;
        l>>>=10;
        System.out.println(l);
        short s=-1;
        s>>>=10;
        System.out.println(s);
        byte b=-1;
        b>>>=10;
        System.out.println(b);
    }
}
