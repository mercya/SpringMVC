package com.springmvc.test;

import org.apache.commons.collections.map.HashedMap;

import java.util.*;

/**
 * Created by eCRF on 2018/2/24.
 */
public class Map1 {
    public final static String[][] testData1={
            {"Happy","Cheerful disposition"},
            {"sleepy","Prefers darf, quiet places"},
            {"Grumpy","Needs to work on attutude"},
            {"Doc","Fantasizes about advanced degree"},
            {"Sneezy","Struggles with allergies"},
            {"Bashful","Needs self-esteem workshop"},
    };
    public final static String[][] testData2={
            {"Belligerent","Disruptive influence"},
            {"Lazy","Motivational problems"},
            {"Comatose","Excellent behavior"},
    };

    public  static Map fill(Map m,Object[][] o){
        for (int i=0;i<o.length;i++){
            m.put(o[i][0],o[i][1]);
        }
        return m;
    }
    public static void printKeys(Map m){
        System.out.print("Size= "+m.size()+",");
        System.out.print("keys:");
        Collection1.print(m.keySet());
    }
    public static void printValues(Map m){
        System.out.print("Values:");
        Collection1.print(m.values());
    }
    public static void print(Map m){
        Collection entries =m.entrySet();
        Iterator it=entries.iterator();
        while (it.hasNext()){
            Map.Entry e= (Map.Entry) it.next();
            System.out.println("Key="+e.getKey()+"Vakues="+e.getValue());
        }
    }
    public static  void test(Map m){
        fill(m,testData1);
        fill(m,testData1);
        printKeys(m);
        printValues(m);
        print(m);
        String key=testData1[4][0];
        String value=testData1[4][1];
        System.out.println("m.get(\""+key+"\"):"+m.get(key));
        System.out.println("m.containsValue(\""+value+"\"):"+m.containsValue(value));
        Map m2=fill(new TreeMap(),testData2);
        m.putAll(m2);
        printKeys(m);
        m.remove(testData2[0][0]);
        printKeys(m);
        m.clear();
        System.out.println("m.isEmpty:"+m.isEmpty());
        fill(m,testData1);
        m.keySet().removeAll(m.keySet());
        System.out.println("m.isEmpty():"+m.isEmpty());
    }
    public static  void main(String args[]){
        System.out.println("Testing HashMap");
        test(new HashMap());
        System.out.println("Testing TreeMap");
        test(new TreeMap());
    }

}
