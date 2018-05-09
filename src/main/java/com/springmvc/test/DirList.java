package com.springmvc.test;

import org.apache.commons.io.filefilter.DirectoryFileFilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by eCRF on 2018/3/13.
 */
public class DirList {
    public static  void main(String[] args){
        try {
            File path=new File(".");
            String[] list;
            if (args.length==0)
                list=path.list();
            else {
                list = path.list(new DirFilter(args[0]));
            }
            for (String x :list) {
                System.out.println(x);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    static class  DirFilter implements FilenameFilter{

        String afn;

        DirFilter(String afn) {
            this.afn = afn;
        }

        @Override
        public boolean accept(File dir, String name) {
            String f=new File(name).getName();
            return f.indexOf(afn)!=-1;
        }
    }



}
