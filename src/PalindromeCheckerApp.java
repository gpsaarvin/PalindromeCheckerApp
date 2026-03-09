public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to create linked list from string
    public static Node createLinkedList(String s) {
        if (s == null || s.isEmpty()) return null;

        Node head = new Node(s.charAt(0));
        Node current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new Node(s.charAt(i));
            current = current.next;
        }
        return head;
    }

    // Method to find middle of linked list using fast and slow pointers
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Reverse linked list starting from head node, returns new head
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Check palindrome by comparing two halves
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle
        Node middle = findMiddle(head);

        // Reverse second half
        Node secondHalfStart = reverseList(middle.next);
        middle.next = secondHalfStart;

        // Compare halves
        Node p1 = head;
        Node p2 = secondHalfStart;
        boolean palindrome = true;

        while (p2 != null) {
            if (p1.data != p2.data) {
                palindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Restore list (optional)
        middle.next = reverseList(secondHalfStart);

        return palindrome;
    }

    // Helper method to print linked list (optional)
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("===== Palindrome Checker (UC8 - Linked List) =====");

        String input = "racecar";
        System.out.println("Input String: " + input);

        Node head = createLinkedList(input);

        // Optional: print linked list
        System.out.print("Linked List: ");
        printList(head);

        boolean result = isPalindrome(head);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
