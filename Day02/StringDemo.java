package com.ff.javaapi.Day02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {

        String s="abc";
        byte data[]=s.getBytes();//编码 即就是字符转为字节
        System.out.println(Arrays.toString(data));

        String s2= new String(data);//解码 即就是字节转为字符
        System.out.println(s2);

        String s1="我爱学习";
        byte d [] = new byte[0];
        try {
            d = s1.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(d));

        String s3= null;
        try {
            s3 = new String(d,0,4,"GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(s3);
}
}
