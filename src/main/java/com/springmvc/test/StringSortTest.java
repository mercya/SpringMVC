package com.springmvc.test;

import java.util.Enumeration;

/**
 * Created by eCRF on 2018/2/23.
 */
public class StringSortTest {
    static class  StringCompare implements  Compare{
        @Override
        public boolean lessThan(Object l, Object r) {
            return ((String)l).toLowerCase().compareTo(((String)r).toLowerCase())<0;
        }

        @Override
        public boolean lessThanOrEqual(Object l, Object r) {
            return ((String)l).toLowerCase().compareTo(((String)r).toLowerCase())<=0;
        }
    }


    public static  void main(String[] args){
        SortVector sv=new SortVector(new StringCompare());
        sv.addElement("d");
        sv.addElement("A");
        sv.addElement("C");
        sv.addElement("c");
        sv.addElement("b");
        sv.addElement("B");
        sv.addElement("D");
        sv.addElement("a");
        sv.sort();
        Enumeration e=sv.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
