
abstract class Calculator{
    abstract void add(int a, int b);
    abstract void sub(int a, int b);
    abstract void mul(int a, int b);
    abstract void div(int a, int b);

    void show(){
        System.out.println("This is a calculator");
    }
}
class Test extends Calculator{  
    void add(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
     void sub(int a, int b){
        System.out.println("The sub is: " + (a-b));
    }
     void mul(int a, int b){
        System.out.println("The mul is: " + (a*b));
    }
     void div(int a, int b){
        System.out.println("The div is: " + (a/b));
    }
}


public class main1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.add(5, 3);
        t.sub(5, 3);
        t.mul(5, 3);
        t.div(5, 3);
        t.show();
    }
}
