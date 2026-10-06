                                                                                             MULTITHREADING
AIM:To write a Java program to demonstrate multithreading using the Thread class, yield(), sleep(), and multiple threads.
ALGORITHM:
Start the program.
Create three classes A, B, and C by extending the Thread class.
Override the run() method in each class.
In thread A, use Thread.yield() to give other threads a chance to execute.
In thread B, display values from 1 to 3 and terminate the thread using break.
In thread C, use Thread.sleep(1500) to pause the thread for 1.5 seconds.
Create objects for threads A, B, and C.
Start all three threads using the start() method.
Display the message from the main thread.
Stop the program.

PROGRAM:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}
OUTPUT:
Start thread A
exit from main thread
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
thread C = 1
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5

RESULT:
Thus, the Java program to demonstrate multithreading using Thread, yield(), and sleep() was successfully executed and the required output was obtained.
