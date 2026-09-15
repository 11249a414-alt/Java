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