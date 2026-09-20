package test1.ooptest9;

public abstract class Teacher extends Person {
    public Teacher(){

    }
    public Teacher(String name, int age){
        super(name, age);
    }

    public abstract void teach();
}
