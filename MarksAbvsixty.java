                                                                                    TO PRINT MARKS ABOVE 60
AIM:To write a Java program to read the names and marks of students and print the students whose marks are 60 or above.
ALGORITHM:
Start the program.
Declare arrays to store student names and marks.
Read the name and marks of 6 students.
Store the values in the respective arrays.
Traverse through the marks array.
Check whether each student's marks are greater than or equal to 60.
If the condition is true, display the student's name and marks.
Stop the program.

PROGRAM:
import java.util.Scanner;

public class MarksAbvsixty {
    public static void main(String args[]) {

        int marks[] = new int[6];
        String name[] = new String[6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");

            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        System.out.println("Students scoring 60 or above:");

        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }

        scanner.close();
    }
}

OUTPUT:
Enter Name of Student and Marks of Subject1:Arun 75
Enter Name of Student and Marks of Subject2:Bala 45
Enter Name of Student and Marks of Subject3:Kavi 82
Enter Name of Student and Marks of Subject4:Ravi 55
Enter Name of Student and Marks of Subject5:Priya 68
Enter Name of Student and Marks of Subject6:Anu 39

Arun 75
Kavi 82
Priya 68
    
RESULT:
Thus, the Java program to print the marks above 60 was successfully executed and the required output was obtained.
