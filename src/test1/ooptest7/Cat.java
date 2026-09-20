package test1.ooptest7;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼~");
    }

    public void move(){
        System.out.println("猫捉耗子~");
    }
}
