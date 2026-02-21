class Parent{
    void display(){
        privatemethod();
        System.out.println("i am in display ()of parent class ");
    }

    protected void privatemethod(){
        System.out.println("i am ina a private");
    }
}
class Child extends Parent{
    void show(){
       System.out.println( "i am in show () of child class ");
    }
}
public class main{
    public static void main(String[] args) {
        // Parent p=cnew Parent();
        // p.display();
        Child C=new Child();
        C.display();
        C.show();
        C.protectedmethod();

    }
}