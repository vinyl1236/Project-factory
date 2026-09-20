package test1.ooptest1;

public class Test {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("zhangsan");
        stu1.setAge(18);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        stu1.eat();
        stu1.sleep();
        stu1.study();

        Student stu2=new Student("lishishi",16);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu2.eat();
        stu2.sleep();
        stu2.study();
    }
}
