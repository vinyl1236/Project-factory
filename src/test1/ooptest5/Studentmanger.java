package test1.ooptest5;

public class Studentmanger {
    public void register(person person){
        System.out.println("姓名是"+person.getName()+"的账号注册成功，账号是"+person.getUsername()+"密码是"+person.getPassword());
        person.work();
    }


}
