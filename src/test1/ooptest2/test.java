package test1.ooptest2;

public class test {
    public static void main(String[] args){
        //无参构造
        Circlearea c1 = new Circlearea();
        c1.setRadius(5);
        System.out.println("面积"+c1.getArea());
        System.out.println("周长"+c1.getPerimeter());
        //有参构造
        Circlearea c2 = new Circlearea(3);
        System.out.println("面积"+c2.getArea());
        System.out.println("周长"+c2.getPerimeter());
    }
}
