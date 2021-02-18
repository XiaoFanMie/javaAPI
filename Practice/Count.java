package Practice;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        char [] a = new char[100];
        String s = input.next();
        a=s.toCharArray();
        int count=0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i]=='c'){
                count++;
            }
        }
        System.out.println(count);
    }
}
