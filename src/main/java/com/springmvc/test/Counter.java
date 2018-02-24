package com.springmvc.test;

import java.util.Hashtable;

/**
 * Created by eCRF on 2018/2/22.
 */
class Counter {
    int  i=1;

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
class Statics{
    public static void main(String[] args){
        Hashtable ht=new Hashtable();
        for (int i=0;i<10000;i++){
            Integer r=new Integer((int) (Math.random()*20));
            if (ht.containsKey(r))
                ((Counter)ht.get(r)).i++;
            else
                ht.put(r,new Counter());
        }
        System.out.println(ht);
    }
}
