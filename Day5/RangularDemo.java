package com.ff.javaapi.Day5;
import java.util.Scanner;

public class RangularDemo {
    /*
     a.制定手机号格式,并验证
	 b.制定qq号格式并验证
	 c.制定邮箱格式并验证
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String s = input.next();
        if (s.matches("1([013456789])\\d{9}$")){
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }*/
        /*String s1 = input.next();
        if (s1.matches("\\d{5,10}")){
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }*/
        String s2 = input.next();
        if (s2.matches("\\d{5,10}+@\\w+.\\w+")){
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }
    }
}
