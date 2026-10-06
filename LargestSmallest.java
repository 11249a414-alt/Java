                                                      TO FIND LARGEST AND SMALLEST NUMBER IN AN ARRAY
AIM:To write a Java program to find the largest and smallest number in a given array.
ALGORITHM:
Start the program.
Initialize the array with elements.
Set the first element as both min and max.
Traverse the array from the second element.
If the current element is greater than max, update max.
If the current element is smaller than min, update min.
Calculate the sum of the array elements.
Display the sum, largest number, and smallest number.
Stop the program.
    
PROGRAM:
    public class LargestSmallest {
    public static void main(String[] args) {

        int a[] = new int[] {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is : " + sum);
        System.out.println("Largest Number in a given array is : " + max);
        System.out.println("Smallest Number in a given array is : " + min);
    }
}

OUTPUT:
The sum is : 357
Largest Number in a given array is : 90
Smallest Number in a given array is : 9

RESULT:
Thus, the Java program to find the largest and smallest number in an array was successfully executed and the required output was obtained.
