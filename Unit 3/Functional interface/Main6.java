interface Example2{
    void display();
}

public class Main6 {
    int a;
    Main6(int a){
        this.a=a;
    }
    void show(){
        Example2 E2=()->System.out.println(a);
        E2.display();
    }
    public static void main(String[] args) {
        Main6 M1=new Main6(10);
        M1.show();
    }

    
}
