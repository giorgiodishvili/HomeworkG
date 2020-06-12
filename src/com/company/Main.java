package com.company;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        InputStreamReader inp = new InputStreamReader(new FileInputStream("D:\\read1.txt"));
        char ch;
        String s="";
        while (inp.ready()){
            s+=(char) inp.read()+"";
        }
        inp.close();
        System.out.println(s);
    }
}
