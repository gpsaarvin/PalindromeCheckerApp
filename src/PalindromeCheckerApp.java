// UC11: Object-Oriented Palindrome Service

import java.util.Stack;

class PalindromeChecker {
    // Encapsulated method to check palindrome
    public boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC11 - OOP Service) =====");

        String input = "level";
        System.out.println("Input String: " + input);

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}