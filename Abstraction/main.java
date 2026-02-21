abstract class Example{
    abstract void display();
    void show(){
        System.out.println("abstract");
    }
}
class Test extends Example{
    void display(){
        System.out.println("class");
    }
}


public class main {
    public static void main(String[] args) {
        Test T=new Test();
        T.display();
        T.show();
    }
    
}
