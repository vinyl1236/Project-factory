package test1.ooptest9;

public class Test {
    public static void main(String[] args) {
        Pingpangteacher teacher = new Pingpangteacher("张三", 30);
        System.out.println(teacher.getName() + "的年龄是" + teacher.getAge());
        teacher.teach();
        teacher.studyenglish();
        System.out.println("-----------------");
        Pingpangplayer player = new Pingpangplayer("李四", 20);
        System.out.println(player.getName() + "的年龄是" + player.getAge());
        player.study();
        Studyenglish1.studyenglish1();

    }
}
