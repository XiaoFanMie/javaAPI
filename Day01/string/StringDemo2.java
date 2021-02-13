package com.ff.javaapi.Day01.string;

public class StringDemo2 {
    public static void main(String[] args) {
        /*
        字符串是常亮,值不能改变,一旦改变是在内存中重新创建一个新的对象
         private final char value[];
         字符串底层是char数组存储,单个字符存储
         final修饰的值不能改变
         */
        String s="a";
        s+="b";
        s+="c";
        s+="d";
        s+="e";
        System.out.println(s);
    }
}
