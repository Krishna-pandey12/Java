class A{
    final void display(){
        System.out.println("name");
    }

}
class B extends A{
    void display(){
        System.out.println("krishna");
    }

}

public class main2 {
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
    
}
