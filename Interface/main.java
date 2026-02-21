interface Example{
    int n=10;
    void display();
}
class Sample implements Example{
    public void display(){
        System.out.println("hello");
    }


}
public class main{
    public static void main(String[] args) {
       Sample s=new Sample();
       s.display();
       System.out.println(Sample.n);
       System.out.println(Example.n);
    }

}