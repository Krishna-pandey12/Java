interface Sample3{
   int sum(int a,int b);

}


public class Main3 {
    public static void main(String[] args) {
        Sample3 S=(int a,int b)->{return a+b;};
        int res=S.sum(10,20);
        System.out.println(res);
    }
    
}