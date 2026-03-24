class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread started ");
    }
}
public class Main{
    public static void main(String[] args) {
        Thread T1=new Thread();
        T1.start();
    }
}