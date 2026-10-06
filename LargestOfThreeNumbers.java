                                                                         LARGEST OF THREE NUMBERS
AIM:To write a Java program to find the largest of three numbers using conditional statements.
ALGORITHM:
Start the program.
Declare three integer variables x, y, and z.
Read three numbers from the user.
Compare x with y and z.
If x is greater than both, display that the first number is largest.
Otherwise, compare y with x and z.
If y is greater than both, display that the second number is largest.
Otherwise, compare z with x and y.
If z is greater than both, display that the third number is largest.
If none of the conditions are satisfied, display that the numbers are not distinct.
Stop the program.

SOURCE CODE:
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;

        System.out.println("Enter three integers");

        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest.");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest.");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest.");
        } 
        else {
            System.out.println("The numbers are not distinct.");
        }

        in.close();
    }
}
OUTPUT:
Enter three integers
45
0
100
Third number is largest.

RESULT:
Thus, the Java program to find the largest of three numbers was successfully executed and the required output was obtained.
