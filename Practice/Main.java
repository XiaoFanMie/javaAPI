package Practice;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ranNum = random.nextInt(100);
        while (true) {
            int num = scanner.nextInt();
            if (num < ranNum) {
                System.out.println("小");
            } else if (num > ranNum) {
                System.out.println("大");
            } else {
                System.out.println("==");
                break;
            }
        }
    }
}