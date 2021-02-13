package com.ff.javaapi.Day01.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "abcdefghra";
        //          0123456789
        String str="a";
        String str1="c";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println("比较两个字符串"+str.compareTo(str1));
        System.out.println("将指定的字符串连接到该字符串的末尾"+s.concat(str1));
        System.out.println("当且仅当此字符串包含指定的char值序列时才返回true"+s.contains(str));
        System.out.println("返回指定字符第一次出现的字符串内的索引"+s.indexOf("a"));
        System.out.println("第二次出现的字符串内的索引"+s.indexOf("a",2));
        System.out.println("从后查找第二次出现的字符串内的索引"+s.lastIndexOf("a",2));
        System.out.println("判断字符串是否为空"+s.isEmpty());
        System.out.println("测试此字符串是否以指定的前缀开头"+s.startsWith("c"));
        System.out.println("从2开始返回后面的字符串"+s.substring(2));
        System.out.println("返回2到7的字符串"+s.substring(2,7));
        System.out.println("转小写"+s.toLowerCase());
        System.out.println("转大写"+s.toUpperCase());
        System.out.println("忽略大小写比较"+s.equalsIgnoreCase("ABCDEFGHRA"));
        System.out.println("测试此字符串是否以指定的后缀结尾"+s.endsWith(str1));
        System.out.println("测试是否以该字符串开头"+s.startsWith("abc"));
    }
}
