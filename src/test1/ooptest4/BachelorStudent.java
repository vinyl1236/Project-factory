package test1.ooptest4;

public class BachelorStudent extends Student {
    public BachelorStudent(){
    }
    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("本科的同学正在攻读本科内容");
    }
}
