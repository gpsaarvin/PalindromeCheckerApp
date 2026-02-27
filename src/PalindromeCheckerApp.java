// UC2: Hardcoded Palindrome Check

public class UseCase2PalindromeCheckerApp {

    // Main Method - Entry Point
    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        System.out.println("===== Palindrome Checker (UC2) =====");
        System.out.println("Given Word: " + word);

        // Reverse the string manually
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Conditional Check
        if (word.equals(reversed)) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}