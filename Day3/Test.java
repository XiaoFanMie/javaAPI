package com.ff.javaapi.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0;
        Collection<String> p = new ArrayList<>();
        out:
        for (int i = 0; ; i++) {
            int flag=0;
            System.out.println("选择操作功能:1.注册,2.登录");
            int foundation = input.nextInt();
            switch (foundation) {
                case 1:
                    System.out.println("请输入手机号:");
                    int num = input.nextInt();
                    System.out.println("请输入密码");
                    String passWord = input.next();
                    p.add(num,passWord);
                    k++;
                    System.out.println(p);
                    continue out;


               case 2:
                    System.out.println("请输入手机号:");
                    String num1 = input.next();
                    System.out.println("请输入密码");
                    String passWord1 = input.next();

                    for (String s:p) {
                       if ( s.contains(num1) && s.contains(passWord1)){
                           flag=1;
                           System.out.println("登陆成功");
                           break;
                       }
                    }
                    if (flag==0){
                        System.out.println("用户或密码输入错误");
                    }
            }
        }
    }
}
