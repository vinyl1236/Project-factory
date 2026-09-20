package BankApp;

import static BankApp.Login.sc;

public class AccountMenu {
    public static void menu() {
        while(true) {
            System.out.println("---------------------");
            System.out.println("账号菜单");
            System.out.println("1.查询余额，2.转账，3.存款，4.退出登录");
            System.out.println("请输入您的选择：");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("---------------------");
                    System.out.println("查询余额");
                    AccountShore.queryBalance();
                    break;
                case "2":
                    System.out.println("---------------------");
                    System.out.println("转账");
                    AccountShore.transfer();
                    break;
                case "3":
                    System.out.println("---------------------");
                    System.out.println("存款");
                    AccountShore.deposit();
                    break;
                case "4":
                    System.out.println("---------------------");
                    System.out.println("退出登录");
                    return;
                default:
                    System.out.println("---------------------");
                    System.out.println("输入错误");
                    break;
            }
        }

    }
}
