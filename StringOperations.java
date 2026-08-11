public class StringOperations {
    public static void main(String[] args) {

        String str = "Java Programming";
        String str2 = "java programming";

        // 1. Length
        System.out.println("Length: " + str.length());

        // 2. Character at index
        System.out.println("Character at index 2: " + str.charAt(2));

        // 3. Concatenation
        System.out.println("Concatenation: " + str.concat(" Language"));

        // 4. String comparison
        System.out.println("equals(): " + str.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(str2));
        System.out.println("compareTo(): " + str.compareTo(str2));

        // 5. Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 6. Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 7. Substring
        System.out.println("Substring: " + str.substring(5));
        System.out.println("Substring (0-4): " + str.substring(0, 4));

        // 8. Searching
        System.out.println("Index of 'Programming': "
                + str.indexOf("Programming"));

        System.out.println("Contains 'Java': "
                + str.contains("Java"));

        System.out.println("Starts with 'Java': "
                + str.startsWith("Java"));

        System.out.println("Ends with 'ing': "
                + str.endsWith("ing"));

        // 9. Replace
        System.out.println("Replace: "
                + str.replace("Java", "Python"));

        // 10. Trim
        String str3 = "   Hello Java   ";
        System.out.println("Before trim: [" + str3 + "]");
        System.out.println("After trim: [" + str3.trim() + "]");

        // 11. Check empty
        String str4 = "";
        System.out.println("Is empty: " + str4.isEmpty());

        // 12. Convert to character array
        char[] chars = str.toCharArray();
        System.out.print("Character array: ");

        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 13. Split
        String fruits = "Apple,Banana,Mango";
        String[] fruitArray = fruits.split(",");

        System.out.println("Split strings:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 14. String to Integer
        String number = "100";
        int n = Integer.parseInt(number);
        System.out.println("String to Integer: " + (n + 50));

        // 15. Integer to String
        int num = 200;
        String converted = String.valueOf(num);
        System.out.println("Integer to String: " + converted);

        // 16. String concatenation using +
        String name = "John";
        int age = 20;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}