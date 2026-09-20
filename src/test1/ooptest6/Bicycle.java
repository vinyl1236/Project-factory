package test1.ooptest6;

public class Bicycle extends Transportation {
    public Bicycle() {
    }

    public Bicycle(String brand, double speed){
        super(brand, speed);
    }

    @Override
    public void move(){
        System.out.println(getBrand() + " 的自行车速度是 " + getSpeed() + " km/h");
    }

    public void ringbell(){
        System.out.println("铃~~~铃~~~铃~~~");
    }
}
