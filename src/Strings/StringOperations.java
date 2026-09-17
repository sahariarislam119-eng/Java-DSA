package Strings;

public class StringOperations {
    public static void main(String[] args) {
        String text = "madam racecar apple";

        // 1. Splitting a string by spaces into an array
        String[] words = text.split(" ");

        System.out.println("Checking words for palindromes:\n");

        for (String word : words) {
            // 2. Reversing a string using StringBuilder
            String reversed = new StringBuilder(word).reverse().toString();

            // 3. Comparing original and reversed (ignoring case)
            boolean isPalindrome = word.equalsIgnoreCase(reversed);

            System.out.println("Word: " + word);
            System.out.println("Reversed: " + reversed);
            System.out.println("Is Palindrome? " + isPalindrome);
            System.out.println("--------------------");
        }

        // 4. Replacing characters or words
        String sample = "I love Java 8";
        String updated = sample.replace("8", "21");
        System.out.println("Replaced: " + updated); // I love Java 21

        // 5. Trimming whitespace
        String padded = "   trim me!   ";
        System.out.println("Trimmed: '" + padded.trim() + "'"); // 'trim me!'
    }
}
