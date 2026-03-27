interface Example3{
    void display();
}

public class Main7 {
    static int x = 10;  

    public static void main(String[] args) {

        Example3 s = () -> {
            System.out.println("Value of x: " + x);
        };

        s.display();
    }
}
    

