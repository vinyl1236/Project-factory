package BankApp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static BankApp.Login.sc;

public class AccountShore {
    private static final Path accountFile = Paths.get("account.txt");

    public static boolean registerAccount(String account, String password) {
        try {
            if(Files.exists(accountFile)) {
                for(String line : Files.readAllLines(accountFile, StandardCharsets.UTF_8)) {
                    if(line.startsWith(account + ",")) {
                        return false;
                    }
                }
            }

            String data=account + "," + password + ",0.0" + System.lineSeparator();

            Files.write(accountFile,
                    data.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            return true;

        } catch (IOException e) {
            System.out.println("注册账号失败"+e.getMessage());
            return false;
        }
    }

    private static String currentAccount;

    public static boolean loginAccount(String account, String password) {
        try {
            if(Files.exists(accountFile)) {
                for(String line : Files.readAllLines(accountFile, StandardCharsets.UTF_8)) {
                    String[] parts =line.split(",",3);
                    if(parts.length >= 2 && parts[0].equals(account) && parts[1].equals(password)) {
                        currentAccount = account;
                        return true;
                    }
                }
            }
        }catch (IOException e) {
            System.out.println("登录账号失败"+e.getMessage());
        }
        return false;
    }



    public static void queryBalance() {
        if(currentAccount == null) {
            System.out.println("请先登录");
            return;
        }
        try{
            for(String line : Files.readAllLines(accountFile, StandardCharsets.UTF_8)) {
                if(line.startsWith(currentAccount + ",")) {
                    System.out.println("您的余额为：" + line.split(",")[2]);
                    return;
                }
            }
        }catch (IOException e) {
            System.out.println("查询余额失败"+e.getMessage());
        }
    }

    public static void deposit(){
        if(currentAccount == null) {
            System.out.println("请先登录");
            return;
        }

        double amount;
        try{
            System.out.println("请输入存款金额：");
            amount = Double.parseDouble(sc.nextLine().trim());
        }catch(NumberFormatException e){
            System.out.println("存款金额必须是数字");
            return;
        }

        if(amount <= 0) {
            System.out.println("存款金额必须大于0");
            return;
        }

        try{
            List<String> lines = Files.readAllLines(accountFile, StandardCharsets.UTF_8);
            for(int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(",");
                if(parts[0].equals(currentAccount)&&parts.length>=2) {
                    double balance = parts.length>=3?Double.parseDouble(parts[2]):0.0;
                    double newBalance = balance + amount;
                    lines.set(i, parts[0] + "," + parts[1] + "," + newBalance);
                    Files.write(accountFile,lines,StandardCharsets.UTF_8);
                    System.out.println("存款成功");
                    System.out.println("您的余额为：" + newBalance);
                    return;
                }
            }
        }catch (IOException e) {
            System.out.println("存款失败"+e.getMessage());
        }


    }

    public static void transfer() {
        if(currentAccount == null) {
            System.out.println("请先登录");
            return;
        }
        System.out.println("请输入转账账号：");
        String targetAccount = sc.nextLine();
        if(targetAccount.equals(currentAccount)) {
            System.out.println("不能转账给自己自己");
            return;
        }

        System.out.println("请输入转账金额：");
        double amount;

        try{
            amount = Double.parseDouble(sc.nextLine().trim());
        }catch(NumberFormatException e){
            System.out.println("转账金额必须是数字");
            return;
        }
        if(amount <= 0) {
            System.out.println("转账金额必须大于0");
            return;
        }

        try{
            List<String> lines = Files.readAllLines(accountFile, StandardCharsets.UTF_8);
            int currentAccountIndex = -1;
            int targetAccountIndex = -1;
            double currentBalance = 0.0;
            double targetBalance = 0.0;
            for(int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(",",3);
                if(parts[0].equals(currentAccount)&&parts.length>=2) {
                    currentAccountIndex = i;
                    currentBalance = parts.length>=3?Double.parseDouble(parts[2]):0.0;
                } else if(parts[0].equals(targetAccount)&&parts.length>=2) {
                    targetAccountIndex = i;
                    targetBalance = parts.length>=3?Double.parseDouble(parts[2]):0.0;
                }
            }
            if(targetAccountIndex == -1) {
                System.out.println("转账失败,目标账号不存在");
                return;
            }
            if(currentBalance < amount) {
                System.out.println("转账失败,余额不足");
                return;
            }
            String[] currentParts = lines.get(currentAccountIndex).split(",",3);
            String[] targetParts = lines.get(targetAccountIndex).split(",",3);
            double newCurrentBalance = currentBalance - amount;
            double newTargetBalance = targetBalance + amount;
            lines.set(currentAccountIndex, currentParts[0] + "," + currentParts[1] + "," + newCurrentBalance);
            lines.set(targetAccountIndex, targetParts[0] + "," + targetParts[1] + "," + newTargetBalance);
            Files.write(accountFile,lines,StandardCharsets.UTF_8);
            System.out.println("转账成功");
            System.out.println("您的余额为：" + newCurrentBalance);
            System.out.println("目标账号余额为：" + newTargetBalance);
        }catch (IOException e) {
            System.out.println("转账失败"+e.getMessage());
        }
    }
}
