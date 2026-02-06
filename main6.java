class StaticExample{
    void normal(){
        System.out.println("I am in static method");
    }
    static void display(){
        System.out.println("i am in a static display");
    }
    static void show(){
        System.out.println("i am in static show");
    }

}

public class main6 {
    public static void main(String[] args) {
        StaticExample SE=new StaticExample();
        StaticExample.display();
    }
    
}
