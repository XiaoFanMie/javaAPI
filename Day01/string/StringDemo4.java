package com.ff.javaapi.Day01.string;

public class StringDemo4 {
    public static void main(String[] args) {
        /*
        替换功能
            String replace(char old,char new)
            String replace(String old,String new)
            replaceAll(String regex, String replacement)
            replaceFirst(String regex, String replacement)
            去除字符串两空格
            String trim()
         */
        String s="abcabc";
        System.out.println(s.replace("a","A"));
        System.out.println(s.replaceAll("b","B"));
        System.out.println(s);


        String s1="1.sasd ad.";
        System.out.println(s1.replaceFirst("b","B"));
        System.out.println(s1.replaceAll("\\w",""));
        System.out.println(s1.replaceAll("\\W",""));

        String s2=" abc ";
        System.out.println(s2.trim()+"\t"+s2.trim().length());
    }
}
