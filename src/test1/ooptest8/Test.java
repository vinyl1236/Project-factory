package test1.ooptest8;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财", "黄色");
        System.out.println(dog.getName() + "是" + " " + dog.getColor());
        dog.eat();
        dog.swim();
        Frog frog = new Frog("青蛙", "绿色");
        System.out.println(frog.getName() + "是" + " " + frog.getColor());
        frog.eat();
        frog.swim();
        Rabbit rabbit = new Rabbit("兔子", "黄色");
        System.out.println(rabbit.getName() + "是" + " " + rabbit.getColor());
        rabbit.eat();
    }
}
