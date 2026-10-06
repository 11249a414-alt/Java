                                                              ARITHMETIC OPERATIONS USING SWITCH CASE
AIM:To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division and modulus using switch case.
ALGORITHM:
Start the program.
Create a Scanner object to get input from the user.
Read two numbers x and y.
Display the arithmetic operation menu.
Read the user's choice.
Use switch case to perform the selected operation.
Display the result.
Repeat the process until the user selects Exit.
Stop the program.

SOURCE CODE:
    import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("Enter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("Choose the operation you want to perform");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");

            int n = s.nextInt();

            switch (n) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Division by zero is not possible");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 6.");
            }
        }
    }
}


OUTPUT:
Enter the two numbers to perform operations
Enter the first number : 78
Enter the second number : 133
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
1
Result : 211

RESULT:
Thus, the Java program to perform arithmetic operations using switch case was successfully executed and the required output was obtained.
