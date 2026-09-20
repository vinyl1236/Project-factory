package test1.ooptest3;

public class test {
    public static void main(String[] args) {
        firstiphone f = new firstiphone();
        f.call();
        System.out.println("-------------------");
        secondiphone s = new secondiphone();
        s.call();
        s.news();
        System.out.println("-------------------");
        thirdiphone th = new thirdiphone();
        th.call();
        th.news();
        th.playgame();
    }
}
