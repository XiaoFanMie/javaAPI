package Practice;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        char [] a = new char[100];
        String s = input.next();
        a=s.toCharArray();
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]);
        }
    }
}
