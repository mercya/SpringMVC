package com.springmvc.test;

import java.util.Hashtable;

/**
 * Created by eCRF on 2018/2/22.
 */
public class SpringDetector {
    public static  void main(String[] args){
        Hashtable ht=new Hashtable();
        for (int i=0;i<10;i++){

            ht.put(new Groundhog(i),new Prediction());
            System.out.println("ht="+ht+"\n");
            System.out.println("Looking up prediction for groundhog #3:");
            Groundhog gh=new Groundhog(3);
            if (ht.containsKey(gh))
                System.out.println(ht.get(gh));
        }
    }
}
class Groundhog{
    int ghNumber;
    Groundhog(int n){
        ghNumber=n;
    }
}
class Prediction{

    boolean shadow=Math.random()>0.5;

    public String toString() {
        if (shadow)
            return "six more weeks of winter";
        else
        return "early Spring";
    }
}
