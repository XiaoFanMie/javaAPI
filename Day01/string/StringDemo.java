package com.ff.javaapi.Day01.string;


public class StringDemo {
    public static void main(String[] args) {
        /*
        字符串的两种创建方式
        String s="abc";
        第一次创建时,会在字符串常量池中检测有没有,没有就在常量池中创建一个对象
        第二次创建时候,如果常量池中已经存在,直接质量常量池中的对象即可
         */
        String s0="abc";
        String s1="abc";
        System.out.println(s0.equals(s1));//true
        System.out.println(s0==s1);//true

        /*
        new + 构造方法();
        只要new出来的对象,在内存中一定是一个独一无二的对象空间
         */
        String s2=new String("abc");
        String s3=new String("abc");
        System.out.println(s2.equals(s3));//true
        System.out.println(s2==s3);//false
    }
}
