                                                                                          INTERFACE
AIM:To write a Java program to demonstrate the use of an interface by implementing its methods in a class.
ALGORITHM:
Start the program.
Create an interface Animal with methods sound() and eat().
Create a class Dog that implements the Animal interface.
Define the sound() and eat() methods inside the Dog class.
Create an object of the Dog class.
Call the sound() and eat() methods.
Display the output.
Stop the program.
PROGRAM:
    interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats food");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
OUTPUT:
Dog barks
Dog eats food
RESULT:
Thus, the Java program to demonstrate an interface and its implementation was successfully executed and the required output was obtained.
