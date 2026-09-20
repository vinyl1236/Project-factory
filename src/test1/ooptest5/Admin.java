package test1.ooptest5;

public class Admin extends person{
    public Admin(){
    }

    public Admin(String name,String username, String password){
        super(name,username,password);
    }
    @Override
    public void work(){
        System.out.println("管理者的工作是管理~");
    }
}
