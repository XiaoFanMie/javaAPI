package com.ff.javaapi.Day02;

import java.util.Arrays;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "abcdEFG";
        System.out.println(s.toLowerCase());//转小写
        System.out.println(s.toUpperCase());//转大写

        String s1="CRR";
        System.out.println(s1.concat("是傻狗"));//链接字符效率高于+号的连接

        String s2=s1+"傻猪";
        System.out.println(s2);


        /*
        split();将字符串用规定的正则表达式分割为字符串数组
         */
        String s3 = "c:r:r:s:b";
        String [] s33 = s3.split(":");
        System.out.println(Arrays.toString(s33));
        String [] s32 = s3.split("\\W");
        System.out.println(Arrays.toString(s32));
        String s4 = "c|r|r|s|b";
        String [] s41 = s4.split("\\W");
        String [] s42 = s4.split("\\|");
        System.out.println(Arrays.toString(s41));
        System.out.println(Arrays.toString(s42));
    }
}
