package test1.ooptest8;

public class Dog extends Animal {
    public Dog(){

    }
    public Dog(String name, String color) {
        super(name, color);
    }
    @Override
    public void eat() {
        System.out.println("吃骨头~");
    }

    public void swim() {
        System.out.println("狗刨~");
    }
}
