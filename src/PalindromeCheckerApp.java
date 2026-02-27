import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC5 - Stack) =====");

        // Hardcoded string
        String input = "deed";
        System.out.println("Input String: " + input);

        // Stack to hold characters
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);  // Push characters
        }

        // Compare by popping from stack
        boolean isPalindrome = true;
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}