package test1.ooptest9;

public class Basketballteacher extends Teacher {
    public Basketballteacher(){
    }
    public Basketballteacher(String name, int age){
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("我是篮球老师，我在教篮球学生");
    }
}

