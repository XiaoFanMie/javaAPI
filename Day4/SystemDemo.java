package com.ff.javaapi.Day4;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        /*
            public final static PrintStream out = null;
            println()是PrintStream中的方法
         */
        System.out.println();
        /*System.exit(0);//关闭程序退出jvm
        System.out.println("后面的代码");*/
        System.out.println(System.currentTimeMillis());//从1970年1.1 0.0.0 开始到现在毫秒差


        //记录运行次循环的所需时间
        long s = System.currentTimeMillis();
        String s1="";
        for (int i = 0; i < 100000; i++) {
            s1+=i;
            System.out.println(s1);
        }
        System.out.println(System.currentTimeMillis()-s);

        //将指定数组复制到新建数组中
        int [] a = {1,2,3,4,5};
        int [] b = new int[10];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));
    }
}
