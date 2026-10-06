                                                              FILE READING
AIM:To write a Java program to read the contents of a file using FileReader and display the contents on the screen.
ALGORITHM:
Start the program.
Create a FileReader object to open sample2.txt.
Read the file character by character using the read() method.
Check whether the end of the file is reached.
Display each character on the screen.
Close the file using close().
Handle any exception using try-catch.
Stop the program.
PROGRAM:
import java.io.*;
 class Filereader{
    public static void main(String[] args){
     try{
        FileReader fr=new FileReader("sample2.txt"); 
           int i;
           while((i=fr.read())!=-1){
               System.out.println((char)i);
           }
           fr.close();
          }catch(Exception e){
                System.out.println("Exception:"+e);
 }
}
}
OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z

RESULT:ThuS,The Java program to read and display the contents of a file using FileReader was successfully executed and the required output was obtained.
