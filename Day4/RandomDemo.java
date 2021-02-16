package com.ff.javaapi.Day4;
import java.util.Arrays;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random r= new Random();
        System.out.println("随机Boolean:::"+r.nextBoolean());
        System.out.println("随机int数值范围内取值:::"+r.nextInt());
        System.out.println("0-9:::"+r.nextInt(10));//不包含10
        System.out.println(r.nextInt(11)+10);//10-20随机

        /*
        向数组中装入b.length个byte随机数
         */
        byte[] b = new byte[10];
        r.nextBytes(b);
        System.out.println(Arrays.toString(b));
    }
}
