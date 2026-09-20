package test1.ooptest4;

public class Test {
    public static void main(String[] args) {
        BachelorStudent student1 = new BachelorStudent("张三", 18, "本科");
        System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getGrade());
        student1.study();
        student1.sleep();
        MasterStudent student2 = new MasterStudent("李四", 20, "硕士");
        System.out.println(student2.getName() + " " + student2.getAge() + " " + student2.getGrade());
        student2.study();
        student2.sleep();
    }
}
