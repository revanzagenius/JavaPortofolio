package OOPJAVA.Inheritence;

import javax.swing.event.AncestorEvent;

class Animal {
    String name;
    public void eat(){
        System.out.println("I can Eat");
    }
}

class Dog extends Animal{
public void display(){
    System.out.println("My name is : " + name);
}
}

public class Inheritence1 {
    public static void main(String[] args) {
        Dog labrador = new Dog();

        labrador.name="Roky";
        labrador.display();

        labrador.eat();
    }

    
}
