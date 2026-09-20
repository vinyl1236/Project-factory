package test1.ooptest7;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉~");
    }

    public void move(){
        System.out.println("狗看家~");
       }
}
