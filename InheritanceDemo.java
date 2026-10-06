                                                                                      INHERITANCE
AIM:To write a Java program to demonstrate different types of inheritance, such as Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance, and Multiple/Hybrid Inheritance using interfaces.
ALGORITHM:
Start the program.
Create a base class Animal with an eat() method.
Create class Dog extending Animal to demonstrate single inheritance.
Create class Puppy extending Dog to demonstrate multilevel inheritance.
Create class Cat extending Animal to demonstrate hierarchical inheritance.
Create interfaces Pet and Guard.
Create class Dog2 that extends Animal and implements both interfaces to demonstrate multiple/hybrid inheritance.
Create objects for Dog, Puppy, Cat, and Dog2.
Call the inherited and own methods of each object.
Display the output.
Stop the program.
    
PROGRAM:
    class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Interfaces for Multiple Inheritance
interface Pet {
    void friendly();
}

interface Guard {
    void protect();
}

// Multiple + Hybrid Inheritance
class Dog2 extends Animal implements Pet, Guard {

    public void friendly() {
        System.out.println("Dog is friendly");
    }

    public void protect() {
        System.out.println("Dog protects");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple / Hybrid Inheritance
        Dog2 d2 = new Dog2();
        d2.eat();
        d2.friendly();
        d2.protect();
    }
}

OUTPUT:
Animal eats
Dog barks
Animal eats
Dog barks
Puppy plays
Animal eats
Cat meows
Animal eats
Dog is friendly
Dog protects

RESULT:
Thus, the Java program demonstrating Single, Multilevel, Hierarchical, and Multiple/Hybrid Inheritance was successfully executed and the required output was obtained.
