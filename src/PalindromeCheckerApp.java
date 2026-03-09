import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// UC6: Queue + Stack Based Palindrome Check

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker (UC6 - Queue & Stack) =====");

        // Hardcoded string
        String input = "level";
        System.out.println("Input String: " + input);

        // Initialize queue and stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (char ch : input.toCharArray()) {
            queue.offer(ch);  // enqueue
            stack.push(ch);   // push
        }

        // Compare dequeue and pop
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.poll();   // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
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
