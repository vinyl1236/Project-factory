package test1.ooptest4;

public class Teacher extends person{
    private String subject;
    public Teacher(){
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    //get set
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println("教学");
    }
}
