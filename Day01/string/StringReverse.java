package com.ff.javaapi.Day01.string;

import java.lang.reflect.Array;

public class StringReverse {
    public static void main(String[] args) {
        String s="abc";
        byte[] b= s.getBytes();//把字符串转换为byte类型数组
        char [] c = s.toCharArray();//字符串中单个字符存入数组
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"\t");
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(c[i]+"\t");
        }
        System.out.println();
        System.out.println("________________________________");
        String [] s1=s.split("b");//从s字符串的选择位置将字符串分割开来,存入String数组中
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]+"\t");
        }
        char [] c1={'c','r','r','s','b'};
        System.out.println(String.valueOf(c1));//把char类型数组中的内容转换为String类型输出

    }
}
