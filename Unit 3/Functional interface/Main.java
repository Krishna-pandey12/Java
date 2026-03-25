interface Sample{
    void display(String name);
}
public class Main implements Sample {
    public void display(String name){
        System.out.println("the name is"+name);
    }
    public static void main(String[] args) {
        Main M = new Main();
        
        M.display("Java programming");
    }
}