class Addition{
    int a,b;
    Addition(){
        this.a=0;
        this.b=0;
    }
    Addition(int a,int b){
        this.a=a;
        this.b=b;
    // passing object of additiion type
    }
    Addition calsum(Addition A1,Addition A2){
        Addition S=new Addition();
        S.a=A1.a+A2.a;
        S.b=A1.b+A2.b;
        return(S);

    }
    void display(){
        System.out.println(a+" "+b);

    }

}

public class main2 {
    public static void main(String[] args) {
        Addition obj1 =new Addition(10,20);
        obj1.display();
        Addition obj2 =new Addition(100,200);
          obj2.display();
        Addition obj3=new Addition();
        //   obj1.calsum(obj1, obj2);
        obj3=obj1.calsum(obj2, obj3)
    }
    
}
