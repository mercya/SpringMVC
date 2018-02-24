package com.springmvc.test;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by eCRF on 2018/2/22.
 */
public class Stacks {


    static String[] months={
            "january","february","march","april","may","june","july","august","september","october","november"
     ,"december"
    };
    public static void main(String[] args){
        Stack stack=new Stack();
        for (int i=0;i<months.length;i++) {
            stack.push(months[i]+"");
            System.out.println("stk="+stack);

        }
        stack.addElement("tht  last line");
        System.out.println("element 5="+stack.elementAt(5));
        System.out.println("popping elements:");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

}
