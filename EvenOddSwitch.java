                                                                              EVEN OR ODD USING SWITCH CASE
AIM:To write a Java program to check whether the given number is even or odd using switch case.
ALGORITHM:
Start the program.
Import the Scanner class.
Read an integer n from the user.
Find the remainder using n % 2.
Use switch case to check the remainder.
If the remainder is 0, display "This number is even".
If the remainder is 1, display "This number is odd".
Stop the program.

SOURCE CODE:
import java.util.*;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }

        s.close();
    }
}

OUTPUT:
5
This number is odd
