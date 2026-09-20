package test1.ooptest4;

public class MasterStudent extends Student {
    public MasterStudent(){
    }
    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("硕士的同学正在攻读硕士内容");
    }
    @Override
    public void sleep() {
        System.out.println("硕士的同学住宿条件升级了");
    }
}
