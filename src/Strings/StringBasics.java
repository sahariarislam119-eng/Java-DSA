package Strings;

public class StringBasics {
    public static void main(String[] args) {
        // 1. Creating Strings
        String greeting = "Hello";
        String target = "World";

        // 2. Concatenation
        String message = greeting + ", " + target + "!";
        System.out.println("Full Message: " + message); // Hello, World!

        // 3. String Length
        int length = message.length();
        System.out.println("Length: " + length); // 13

        // 4. Accessing Characters
        char firstChar = message.charAt(0);
        System.out.println("First character: " + firstChar); // H

        // 5. Substring (start index inclusive, end index exclusive)
        String sub = message.substring(7, 12);
        System.out.println("Substring: " + sub); // World

        // 6. Case Conversion
        System.out.println("Uppercase: " + message.toUpperCase());

        // 7. Checking Content
        boolean containsWord = message.contains("World");
        System.out.println("Contains 'World': " + containsWord); // true

        // 8. Equality Comparison (always use .equals(), not ==)
        String str1 = new String("Java");
        String str2 = "Java";
        System.out.println("Equal value: " + str1.equals(str2)); // true
    }
}

