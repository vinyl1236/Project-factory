package test1.ooptest9;

public class Basketballplayer extends Player {
    public Basketballplayer(){

    }
    public Basketballplayer(String name, int age){
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("我是篮球学生，我在学习篮球");
    }
}
