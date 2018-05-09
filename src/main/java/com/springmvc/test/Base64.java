package com.springmvc.test;

import sun.misc.BASE64Decoder;

import java.io.IOException;

/**
 * Created by eCRF on 2018/3/15.
 */
public class Base64 {

    public static void main(String[] args) throws IOException {
        //lqd2010
       // bHFkMjAxMA==
        byte[] base64Decoder=new BASE64Decoder().decodeBuffer("ZGFuODEzNUB5ZWFoLm5ldA==");
        byte[] ss=new BASE64Decoder().decodeBuffer("422620467");
        String srt2=new String(base64Decoder,"UTF-8");
        String str=new String(ss,"UTF-8");
        System.out.println(srt2);
        System.out.println(str);


    }
}
