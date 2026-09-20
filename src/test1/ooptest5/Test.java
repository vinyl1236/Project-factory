package test1.ooptest5;

public class Test {
    public static void main(String[] args) {
        Student stu =  new Student("张三","zhangsan","123456");

        Studentmanger manger = new Studentmanger();
        manger.register(stu);
    }
}
