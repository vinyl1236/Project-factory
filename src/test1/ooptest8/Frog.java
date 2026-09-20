package test1.ooptest8;

public class Frog extends Animal {

    public Frog(){

    }

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子~");
    }

    public void swim() {
        System.out.println("蛙泳~");
    }

}
