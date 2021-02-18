package Practice;

import java.util.Scanner;

public class HouZhui {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String s = input.next();
        int t = s.indexOf(".");
        System.out.println(s.substring(t+1));
    }
}
