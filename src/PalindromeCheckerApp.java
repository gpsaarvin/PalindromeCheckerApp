public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true; // Base condition: crossed pointers
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found
        }
        return isPalindrome(s, start + 1, end - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC9 - Recursion) =====");

        String input = "madam";
        System.out.println("Input String: " + input);

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}