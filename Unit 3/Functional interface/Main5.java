import static java.lang.Math.PI;

import java.util.Scanner;
interface Sample6{
    double area(int r);
    // default show(){
    //     System.out.printn("i am in default class" )
    // }
    // static 
}

public class Main5 {
    public static void main(String[] args) {
        // int r=5;
        Sample6 E=(int r)->PI*r*r;
        
        Scanner S=new Scanner(System.in);
        System.out.println("enter the radius");
        
        int res=E.area(3.14);
        System.out.println(res);
        

    }


    
}
