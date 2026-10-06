                                                             TO IMPLEMENT BINARY SEARCH
AIM:To write a Java program to search for an element in an array using the Binary Search technique.
ALGORITHM:
Start the program.
Read the number of elements in the array.
Read the array elements.
Read the element x to be searched.
Set first = 0 and last = n-1.
Find the middle element using mid = (first+last)/2.
If a[mid] > x, set last = mid-1.
If a[mid] < x, set first = mid+1.
If a[mid] == x, display "element found".
Repeat the process until the element is found or first > last.
If the element is not found, display "element not found".
Stop the program.
    
PROGRAM:
import java.util.Scanner;

class BinarySearch {
    public static void main(String ar[]) {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements of array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        // Binary search (array must be in ascending order)
        while (first <= last) {
            mid = (first + last) / 2;

            if (a[mid] > x) {
                last = mid - 1;
            } else if (a[mid] < x) {
                first = mid + 1;
            } else {
                flag = 1;
                System.out.println("Element found at position: " + (mid + 1));
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

OUTPUT:
Enter number of elements:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
30
element found

RESULT:
Thus, the Java program to search for an element using the Binary Search technique was successfully executed and the required result was obtained.
