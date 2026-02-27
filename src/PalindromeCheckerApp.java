public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC10 - Case Insensitive & Space Ignored) =====");

        String input = "A man a plan a canal Panama";
        System.out.println("Original Input: " + input);

        // Normalize string: remove spaces and convert to lower case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        System.out.println("Normalized Input: " + normalized);

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}