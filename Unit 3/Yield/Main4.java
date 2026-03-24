class Sample implements Runnable{
     public void run(){
        System.out.println("Started "+Thread.currentThread());
        Thread.yield();
        System.out.println("Started "+Thread.currentThread());
     }
}

public class Main4 {
    public static void main(String[] args){
        Sample S1=new Sample();
        
        Sample S2=new Sample();
        Thread T1=new Thread(S1,"Thread name");
        Thread T2=new Thread(S1,"Swcond name");
        T1.setPriority(4);
         T2.setPriority(10);
         T1.start();
         T2.start();


    }
    
}
