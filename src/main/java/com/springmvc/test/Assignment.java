package com.springmvc.test;

/**
 * Created by eCRF on 2018/3/7.
 */
class Number{
    int i;
}
public class Assignment {
    public static void main(String[] arfs){
        Number n1=new Number();
        Number n2=new Number();
        n1.i=9;
        n2.i=47;
        System.out.println("1:n1.i :"+n1.i+":2 n2.i"+n2.i);
        n1=n2;
        System.out.println("1:n1.i :"+n1.i+":2 n2.i"+n2.i);
        n1.i=27;
        System.out.println("1:n1.i :"+n1.i+":2 n2.i"+n2.i);



    }

}
