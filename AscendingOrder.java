                                                               TO SORT ELEMENTS IN ASCENDING ORDER
AIM:To write a Java program to sort the given array elements in ascending order.
ALGORITHM:
Start the program.
Read the number of elements n.
Create an integer array of size n.
Read all the elements into the array.
Compare each element with the remaining elements using nested loops.
If the first element is greater than the second element, swap them.
Repeat the comparison until all elements are arranged in ascending order.
Display the sorted array.
Stop the program.
    
PROGRAM:
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        int n, temp;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }

        s.close();
    }
}
OUTPUT:
Enter no. of elements you want in array: 5
Enter all the elements:
45
12
78
23
10
Ascending Order: 10,12,23,45,78

RESULT:
Thus, the Java program to sort the given array elements in ascending order was successfully executed and the required output was obtained.
