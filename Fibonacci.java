                                                                                  FIBONACCI SERIES
AIM:To write a Java program to generate the Fibonacci series for a given number of terms.
ALGORITHM:
Start the program.
Read the number of terms n.
Initialize a = 0 and b = 1.
Display a and b as the first two terms.
Find the next term using c = a + b.
Assign a = b and b = c.
Repeat the process until n terms are printed.
Stop the program.
PROGRAM:
import java.util.Scanner;
class Fibonacci
{
public static void main(String[] args)
{
int n,a=0,b=1,c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of terms: ");
n=sc.nextInt();

System.out.print("Fibonacci Series: ");

for(int i=1;i<=n;i++)
{
System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}
}
}
OUTPUT:
Enter the number of terms: 10
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
RESULT:Thus, the Java program to generate the Fibonacci series was successfully executed and the required output was obtained.
