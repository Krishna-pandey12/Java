interface add{
    int sum(int a,int b);
}
interface sub{
    int subs(int a,int b);
}
class C implements add ,sub{
        public int sum(int a, int b) {
        int result = a + b;
        System.out.println("The sum is: " + result);
        return result;
    }
   
    public int subs(int a, int b) {
        int result = a - b;
        System.out.println("The subtraction is: " + result);
        return result;
    }

}

public class cal {
       public static void main(String[] args) {
        C obj = new C();
        obj.sum(10, 5);
        obj.subs(10, 5);
    }
}
    

