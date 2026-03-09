import java.util.ArrayDeque;
import java.util.Deque;

// UC7: Deque-Based Optimized Palindrome Checker

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker (UC7 - Deque) =====");

        // Hardcoded string
        String input = "civic";
        System.out.println("Input String: " + input);

        // Initialize deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear characters
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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
