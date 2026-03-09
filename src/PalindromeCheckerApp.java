// UC3: Palindrome Check Using String Reverse

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker (UC3) =====");

        // Hardcoded string for checking
        String original = "level";

        System.out.println("Original String: " + original);

        // Reverse the string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
