package test1.ooptest9;

public class Pingpangplayer extends Player implements Studyenglish {
    public Pingpangplayer(){

    }
    public Pingpangplayer(String name, int age){
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("我是乒乓球学生，我在学习乒乓球");
    }

}
