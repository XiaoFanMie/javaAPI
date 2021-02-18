package Practice;

import java.util.Scanner;

public class VerifyPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s= input.next();
        boolean b=isPalindrome(s);
        System.out.println(b);
    }
    public static boolean isPalindrome(String s) {
        s=s.replaceAll("\\W","");
        s=s.replace("_","");
        s=s.toLowerCase();
        char [] c = new char[100];
        c=s.toCharArray();
        for(int i=0,j=c.length-1;i<j;j--,i++){
            if(c[i]!=c[j]){
                return false;
            }
        }
        return true;
    }
}
