package BankApp;

import static BankApp.Login.sc;

public class CreateAccount {
    public static void createAccount() {
        System.out.println("-------注册账号-------");
        System.out.println("请输入账号：");
        String account = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        if(password.length() < 6) {
            System.out.println("密码长度不能小于6位");
            System.out.println("---------------------");
            return;
        }
        System.out.println("请确认密码：");
        String confirmPassword = sc.nextLine();
        if(!confirmPassword.equals(password)) {
            System.out.println("两次密码不一致,创建失败");
            System.out.println("---------------------");
            return;
        }
        if(AccountShore.registerAccount(account, password))
        {
            System.out.println("注册成功");
            System.out.println("您的账号是：" + account + "，密码是：" + password);
        } else {
            System.out.println("注册失败,账号已存在");
        }

        System.out.println("请返回登录页面");
        System.out.println("---------------------");
    }
}
