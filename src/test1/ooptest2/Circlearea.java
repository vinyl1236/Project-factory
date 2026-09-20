package test1.ooptest2;

public class Circlearea {
    private double radius;
    private static final double PI=3.14;
    //无参构造
    public Circlearea(){
    }
    //有参构造
    public Circlearea(double radius){
        this.radius=radius;
    }
    //get set

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //面积
    public double getArea(){
        return radius*radius*PI;
    }
    //周长
    public double getPerimeter(){
        return 2*radius*PI;
    }

}
