abstract class Animal {
    
    String name;

    
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);   
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

public class maain2 {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.sound();
    }
}