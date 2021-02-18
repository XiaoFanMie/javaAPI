package Practice;

import com.ff.javaapi.Day3.Custormer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private int flag = 0;
    User[] Number = new User[20];

    public static void main(String[] args) {
        int N = 0;
        Test t = new Test();
        out:
        for (int i = 0; ; i++) {
            System.out.println("选择操作功能:1.注册,2.登录");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    t.Fundation1(N);
                    continue out;
                case 2: {
                    int s = t.Fundation2(t.flag);
                    if (s == 1) {
                        System.out.println("登陆成功");
                        break;
                    } else if (s == 0) {
                        System.out.println("用户或密码输入错误");
                    }
                }
            }
        }
    }

    public void Fundation1(int N) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入注册手机号:");
        String num = input.next();
        if (num.matches("1([013456789])\\d{9}")){
        }else {
            System.out.println("手机号格式错误");
            System.exit(0);
        }
       System.out.println("请输入密码");
        String passWord = input.next();
        if (passWord.matches("[A-z]\\w{5,9}")){
        }else {
            System.out.println("密码首位只能以字母开头,数字和字母,长度6,10位,密码格式错误");
            System.exit(0);
        }
            User u = new User(num, passWord);
        Number[N] = u;
        N++;
        System.out.println(Arrays.toString(Number));
        System.out.println("注册成功");

    }

    public int Fundation2(int flag) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String num1 = input.next();
        System.out.println("请输入密码");
        String passWord1 = input.next();

        for (int j = 0; j < Number.length; j++) {
            String s = String.valueOf(Number[j]);
            if (s.contains(num1) && s.contains(passWord1)) {
                flag = 1;
            } else {
                flag = 0;
            }
        }
        return flag;
    }
}
