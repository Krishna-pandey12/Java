class Overload{
    int add(int a,int b){
        return(a+b);
    }
     int add(int a,int b,int c){
        return(a+b+c);
    }
    double add(int a,double b){
        return(a+b);
    }
}

public class main {
    public static void main(String[] args) {
        Overload obj1=new Overload();
        int r=obj1.add(10,20,30);
        System.out.println(r);
    }
    
}
