package test1.ooptest6;

public class Car extends Transportation {
    public Car() {
    }

    public Car(String brand, double speed){
        super(brand, speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand() + " 的汽车速度是 " + getSpeed() + " km/h");
    }

    public void honk(){
        System.out.println("叭~~~叭~~~叭~~~");
    }
}
