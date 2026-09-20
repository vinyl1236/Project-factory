package test1.ooptest9;

public class Pingpangteacher extends Teacher implements Studyenglish {
    public Pingpangteacher() {

    }

    public Pingpangteacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("我是乒乓球老师，我在教乒乓球学生");
    }

}
