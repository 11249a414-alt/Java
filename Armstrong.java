                                                                                      ARMSTRONG NUMBER
AIM:To write a Java program to check whether the given number is an Armstrong number or not.
ALGORITHM:
Start the program.
Read a number from the user.
Store the original number in a variable.
Find the number of digits in the given number.
Extract each digit using the modulus operator %.
Raise each digit to the power of the number of digits and add it to sum.
Remove the last digit using integer division /.
Repeat until all digits are processed.
Compare sum with the original number.
If both are equal, display that the number is an Armstrong number.
Otherwise, display that it is not an Armstrong number.
Stop the program.

PROGRAM:
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}

OUTPUT:
Enter a number: 153
153 is an Armstrong number

RESULT:
Thus, the Java program to check whether the given number is an Armstrong number or not was successfully executed and the required output was obtained.
