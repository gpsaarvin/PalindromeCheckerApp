// UC12: Strategy Pattern for Palindrome Algorithms

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// Context class
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC12 - Strategy Pattern) =====");

        String input = "radar";
        System.out.println("Input String: " + input);

        PalindromeContext context = new PalindromeContext();

        // Use StackStrategy
        context.setStrategy(new StackStrategy());
        System.out.println("Using StackStrategy: " + (context.executeStrategy(input) ? "Palindrome" : "Not Palindrome"));

        // Use DequeStrategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Using DequeStrategy: " + (context.executeStrategy(input) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Program Ended.");
    }
}