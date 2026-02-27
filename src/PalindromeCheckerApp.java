import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Stack-based approach
    public static boolean stackCheck(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) stack.push(ch);
        for (char ch : s.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }

    // Deque-based approach
    public static boolean dequeCheck(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : s.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    // Recursive approach
    public static boolean recursiveCheck(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return recursiveCheck(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC13 - Performance Comparison) =====");

        String input = "amanaplanacanalpanama"; // Long input for measurable time
        System.out.println("Input String Length: " + input.length());

        // Stack approach
        long startTime = System.nanoTime();
        boolean stackResult = stackCheck(input);
        long endTime = System.nanoTime();
        System.out.println("Stack Approach: " + (stackResult ? "Palindrome" : "Not Palindrome") + " | Time: " + (endTime - startTime) + " ns");

        // Deque approach
        startTime = System.nanoTime();
        boolean dequeResult = dequeCheck(input);
        endTime = System.nanoTime();
        System.out.println("Deque Approach: " + (dequeResult ? "Palindrome" : "Not Palindrome") + " | Time: " + (endTime - startTime) + " ns");

        // Recursive approach
        startTime = System.nanoTime();
        boolean recursiveResult = recursiveCheck(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive Approach: " + (recursiveResult ? "Palindrome" : "Not Palindrome") + " | Time: " + (endTime - startTime) + " ns");

        System.out.println("Program Ended.");
    }
}