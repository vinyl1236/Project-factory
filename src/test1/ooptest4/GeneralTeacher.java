package test1.ooptest4;

public class GeneralTeacher extends Teacher {
    public GeneralTeacher() {
    }
    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("一般老师正在教一般课程");
    }
}
