package BankApp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("-------银行系统-------");
            System.out.println("欢迎来到银行系统~");
            System.out.println("1.注册账号，2.登录账号，3.退出系统");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    CreateAccount.createAccount();
                    break;
                case "2":
                    Login.login();
                    break;
                case "3":
                    System.out.println("退出系统");
                    running = false;
                    break;
                default:
                    System.out.println("输入错误");
                    break;

            }
        }
    }
}
