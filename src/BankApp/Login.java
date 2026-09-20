package BankApp;

import java.util.Scanner;

public class Login {
    static Scanner sc = new Scanner(System.in);
    private static int count = 0;
    public static void login() {
        System.out.println("-------登录账号-------");
        while(true){
            if(count >= 3) {
                System.out.println("3次登录均失败，系统退出");
                break;
            }
            System.out.println("请输入账号：");
            String account = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if(AccountShore.loginAccount(account, password)) {
                System.out.println("登录成功");
                AccountMenu.menu();
                break;
            } else {
                System.out.println("登录失败，请重新输入");
                count++;
            }
        }
    }
}
