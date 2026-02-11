class StaticMethod{
    static void add(int x,int y){
        System.out.println("I am in static method");
    }
}

public class main3 {
    public static void main(String[] args) {
       int res1= StaticMethod.add();
    }
    
}
