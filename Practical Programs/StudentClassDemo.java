class Student {

    int rollNo;
    String name;
    int age;

    
    Student(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }

 
    void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class StudentClassDemo {
        public static void main(String[] args) {

      
        Student s1 = new Student(101, "Krishna", 20);

        s1.display();
    }

    
}
