package test1.ooptest4;

public class MajorTeacher extends Teacher {
    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("专业老师正在教专业课程");
    }
}
