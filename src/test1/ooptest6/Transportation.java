package test1.ooptest6;

public class Transportation {
    private String brand;
    private double speed;

    public Transportation() {
    }

    public Transportation(String brand, double speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println(brand + " 的交通工具速度是 " + speed+ " km/h");
    }
}
