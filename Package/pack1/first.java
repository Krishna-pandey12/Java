package pack1;
class Example{
     public void display(){
        System.out.println("Display in example");
    }
}
public class first extends Example{
    public static void main(String[] args) {
        Example E=new Example();
        E.display();
    }
}