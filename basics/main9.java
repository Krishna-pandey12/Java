class Student{
    int r;
    String name;
    Student(){
        r=0;
        name=null;
    }
    Student(int r,String name){
        this.r=r;
        this.name=name;

    }
}

public class main9 {
    public static void main(String[] args) {
        Student S=new Student();
        S.display();
    }
    
}
