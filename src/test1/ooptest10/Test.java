package test1.ooptest10;

public class Test {
    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();
        o.show();
    }
}
