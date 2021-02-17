package com.ff.javaapi.Day5;

public class RegexDemo {
    /*
    正则表达式 regex expression 简称：regex
    应用场景：从各种终端向程序中输入数据时，需要对输入的数据格式进行验证（长度、格式）
    是一种模式匹配语法，有许多特定的字符串组成，每种字符串匹配一种规则
    我们使用这些特定的字符，匹配某个字符串，判断字符串是狗满足规定要求
     */
    public static void main(String[] args) {

        boolean boo;
        System.out.println("12".matches("\\d"));
        System.out.println("1".matches("\\d"));//默认匹配一个长度的数字

        //?匹配一次或者一次没有
        System.out.println("1".matches("\\d?"));
        System.out.println("".matches("\\d?"));

        //*匹配0次或者多次
        System.out.println("".matches("\\d*"));
        System.out.println("123".matches("\\d*"));

        //+ 一次或多次
        System.out.println("".matches("\\d+"));//false
        System.out.println("1".matches("\\d+"));//true
        System.out.println("123".matches("\\d+"));//true

        // {n} 恰好n次
        System.out.println("12345".matches("\\d{6}"));//false
        System.out.println("123456".matches("\\d{6}"));//true

        // {n,m} n-m次都可以
        System.out.println("123456".matches("\\d{3,6}"));//true
        System.out.println("123".matches("\\d{3,6}"));//true
        System.out.println("kljnlml"+"13".matches("[^(12)]"));//false

        //{n,} n次以上
        System.out.println("12345".matches("\\d{6,}"));//false
        System.out.println("123456".matches("\\d{6,}"));//true

        // \\D匹配非数字
        System.out.println("aBc".matches("[0-9]*"));//false
        System.out.println("123".matches("[0-9]*"));//匹配0-9数字 true
        System.out.println("aBc".matches("[a-z]*"));//匹配小写字母 false
        System.out.println("aBc".matches("[A-Z]*"));//匹配大写字母 false
        System.out.println("aBc".matches("[A-z]*"));//匹配大小写 true
        System.out.println("13579".matches("[13579]*"));//只匹配1 3 5 7 9 true
        System.out.println("13579".matches("[135]*"));//只匹配1 3 5  false
        System.out.println("13355".matches("[^135]*"));//不匹配1 3 5 false
        System.out.println("24668".matches("[^135]*"));//不匹配1 3 5 true


        // \\w匹配数字和大小写字母
        System.out.println("abc".matches("[a-z]*"));//true
        System.out.println("aBc".matches("[a-z]*"));//false
        System.out.println("aBc".matches("[A-Z]*"));//false
        System.out.println("ABC".matches("[A-Z]*"));//匹配大写字母 true
        System.out.println("aBc13".matches("\\w*"));//匹配大小写字母数字 true
    }
}
