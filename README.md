# Project-factory

一个使用 Java 编写的银行账户控制台项目。项目采用面向对象的方式拆分账户、登录、菜单和账户数据操作，适合用来学习 Java 基础知识、类与对象以及文件读写。

## 功能

- 注册账户
- 登录账户
- 登录失败次数限制
- 查询余额
- 存款
- 向其他账户转账
- 使用 `account.txt` 保存账户和余额数据

## 目录结构

```text
Project-factory/
|-- .gitignore
|-- README.md
`-- src/
    `-- BankApp/
        |-- Test.java            程序入口
        |-- Login.java           登录和退出逻辑
        |-- CreateAccount.java   注册账户
        |-- AccountMenu.java     账户功能菜单
        `-- AccountShore.java    账户数据读写和业务操作
```

## 运行环境

- JDK 17 或更高版本
- 推荐使用 IntelliJ IDEA
- 无第三方依赖

本项目已在 JDK 25 下完成编译验证。

## 克隆项目

```powershell
git clone https://github.com/vinyl1236/Project-factory.git
cd Project-factory
```

## 编译和运行

在项目根目录打开 PowerShell，执行以下命令：

```powershell
$files = Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName
javac -encoding UTF-8 -d out $files
java -cp out BankApp.Test
```

程序入口类是 `BankApp.Test`。编译结果会生成在 `out` 目录中。

如果使用 IntelliJ IDEA，可以直接打开项目，将 `src/BankApp/Test.java` 作为入口类运行。

## 使用说明

启动程序后，按照控制台提示输入数字完成以下操作：

1. 注册账户
2. 登录账户
3. 退出程序

登录成功后可查询余额、存款或向其他已注册账户转账。

## 数据文件

程序运行后会在当前目录生成 `account.txt`，保存账户、密码和余额信息。该文件可能包含敏感数据，因此已经加入 `.gitignore`，不会提交到 GitHub。

## 项目说明

这是一个用于学习 Java 的控制台项目，账户数据使用本地文本文件保存，未实现加密、数据库和并发控制，不适合直接用于生产环境。
