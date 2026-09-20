package test2.Scannertest;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello world");
//        System.out.println(a);
        Random rand = new Random();
        double b = rand.nextDouble(2.2,26.6);
        System.out.println(b);
        String  str = "hello world";
        System.out.println(str);

        String userName = "Zhangwei";
        String rightName = "zhangwei";
        boolean b1 = userName.equalsIgnoreCase(rightName);
        System.out.println(b1);
    }
}
