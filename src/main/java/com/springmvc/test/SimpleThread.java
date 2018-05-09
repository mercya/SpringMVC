package com.springmvc.test;

/**
 * Created by eCRF on 2018/3/30.
 */
public class SimpleThread extends Thread {
    private int countDwon=5;
    private int threadNumber;
    private static int threadCount=0;
    public SimpleThread(){
        threadNumber=++threadCount;
        System.out.println("Market "+ threadNumber);
    }
    public void run(){
        while (true){
            System.out.println("Thread "+ threadNumber+"("+countDwon+")");
            if (--countDwon==0)return;
        }
    }
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            new SimpleThread().start();
            System.out.println("All Threads Started");
        }
    }


}
