package com.springmvc.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by eCRF on 2018/2/24.
 */
public class MyType implements Comparable {

    private int i;

    public MyType(int i) {
        this.i = i;
    }
    public boolean equals(Object o){
        return (o instanceof  MyType)&&(i==((MyType)o).i);
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i+"";
    }

    @Override
    public int compareTo(Object o) {
        int i2= ((MyType)o).i;
        return (i2<i?-1:(i2==i)?0:1);
    }
}
