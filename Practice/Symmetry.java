package Practice;

import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        char [] a = new char[100];
        String s = input.next();
        a=s.toCharArray();
        if (Symmetry1(a)==true){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
    public static boolean Symmetry1(char [] a){
        for (int i = 0,j=a.length-1; i <a.length/2 ; i++,j--) {
            if (a[i]!=a[j]){
                return false;
            }
        }
        return true;
    }
}
