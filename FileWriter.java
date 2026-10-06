                                                                                           FILE WRITING
AIM:To write a Java program to create a file and write the uppercase English alphabets (A–Z) into the file using FileWriter.
ALGORITHM:
Start the program.
Create a FileWriter object for the file sample2.txt.
Use a loop from ASCII value 65 to 90.
Convert each ASCII value into its corresponding character.
Write each character into the file.
Close the file using close().
Handle any exceptions using try-catch.
Stop the program.
PROGRAM:
import java.io.*;

class FileWriter {
    public static void main(String[] args) {
        try {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for (char i = 65; i < 91; i++) {
                fw.write(i);
            }

            fw.close();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
OUTPUT:ABCDEFGHIJKLMNOPQRSTUVWXYZ
RESULT:Thus, the Java program to write uppercase alphabets into a file using FileWriter was successfully executed and the required output was obtained.
