package test1.ooptest6;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三", 18, "男");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
        Transportation car = new Car("奔驰", 120);
        person.drive(car);
    }
}
