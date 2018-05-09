package com.springmvc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by eCRF on 2018/3/30.
 */
public class Daemons {
    public static void main(String[] args) {
        Thread d = new Daemon();
        System.out.println("d.isdaemon=" + d.isDaemon());
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Waiting for CR");
        try {
            stdin.readLine();
        } catch (IOException e) {

        }

    }

}
//后台线程
class Daemon extends Thread{
    private static final  int Size=10;
    private Thread[] t=new Thread[Size];
    public Daemon(){
        setDaemon(true);
        start();
    }
    public void run(){
        for (int i=0;i<Size;i++)
            t[i]=new DaemonSpawn(i);
        for (int i=0;i<Size;i++){
            System.out.println("t["+i+"].isDaemon()="+t[i].isDaemon());
            while (true)
                yield();
        }
    }
}
class DaemonSpawn extends Thread{
    public DaemonSpawn(int i){
        System.out.println("DaemonSpawn "+i+"Started");
        start();
    }
    public void run() {
        while (true)
            yield();
    }

}
