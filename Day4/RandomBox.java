package com.ff.javaapi.Day4;

import java.util.Random;
import java.util.Scanner;

public class RandomBox {

    public static void main(String[] args) {

        System.out.println("请选择游戏等级:1.简单;2.中等;3.困难");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                RandomBox.easy();
            case 2:
                RandomBox.medium();
            case 3:
                RandomBox.hard();
        }
    }

    public static void easy() {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("____________________________________________");
            System.out.println("请猜拳1表示石头,2表示剪刀,3表示布");
            int u1 = input.nextInt();
            System.out.println("用户出:"+switchDemo(u1));
            out:switch (u1) {
                case 1:
                    System.out.println("电脑出:"+switchDemo(2));
                    break out;
                case 2:
                    System.out.println("电脑出:"+switchDemo(3));
                    break out;
                case 3:
                    System.out.println("电脑出:"+switchDemo(1));
                    break out;
            }
            System.out.println("你赢了,你无敌");
        }


    }

    public static void medium() {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("____________________________________________");
            System.out.println("请猜拳1表示石头,2表示剪刀,3表示布");
            int u1 = input.nextInt();
            System.out.println("用户出:"+switchDemo(u1));
            Random r = new Random();
            int com = r.nextInt(3)+1;
            System.out.println("电脑出:"+switchDemo(com));
            if (u1==1){
                if (com == 1){
                    System.out.println("谁都没赢");
                }else if (com==2){
                    System.out.println("你赢了,你无敌");
                }else {
                    System.out.println("你甚不行么");
                }
            }
            if (u1==2){
                if (com == 1){
                    System.out.println("你甚不行么");
                }else if (com==2){
                    System.out.println("谁都没赢");
                }else {
                    System.out.println("你赢了,你无敌");
                }
            }
            if (u1==3){
                if (com == 1){
                    System.out.println("你赢了,你无敌");
                }else if (com==2){
                    System.out.println("你甚不行么");
                }else {
                    System.out.println("谁都没赢");
                }
            }
        }
    }

    public static void hard() {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("____________________________________________");
            System.out.println("请猜拳1表示石头,2表示剪刀,3表示布");
            int u1 = input.nextInt();
            System.out.println("用户出:"+switchDemo(u1));
            out:switch (u1) {
                case 1:
                    System.out.println("电脑出:"+switchDemo(3));
                    break out;
                case 2:
                    System.out.println("电脑出:"+switchDemo(1));
                    break out;
                case 3:
                    System.out.println("电脑出:"+switchDemo(2));
                    break out;
            }
            System.out.println("你甚不行么");
        }
    }

    public static  String switchDemo(int x){
        switch (x) {
            case 1:
                return "石头";
            case 2:
                return "剪刀";
            case 3:
                return "布";
            default:
                System.out.println("输入错误");
                System.exit(0);
        }
        return null;
    }
}
