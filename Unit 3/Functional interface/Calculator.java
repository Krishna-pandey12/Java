 interface Sample8{
    void addition(int a,int b);
    void subtraction(int a,int b);
    void multiply(int a,int b);
    void division(int a,int b);
    void square(int a,int b);
 }
 class MyCalculator implements Sample8 {

    public void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void division(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
       public void square(int a, int b) {
        System.out.println("Square of a: " + (a * a));
        System.out.println("Square of b: " + (b * b));
    }
}



public class Calculator {
    public static void main(String[] args) {

        MyCalculator calc = new MyCalculator();

        calc.addition(10, 5);
        calc.subtraction(10, 5);
        calc.multiply(10, 5);
        calc.division(10, 5);
        calc.square(10, 5);
        
    }
    
}
