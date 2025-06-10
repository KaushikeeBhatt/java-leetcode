public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node list is a palindrome.
        }

        ListNode a = new ListNode(0);  // Not required for the palindrome check
        ListNode previous = a;
        ListNode current = head;
        ListNode cu = head;

        // Step 1: Use two pointers to find the middle of the list.
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Step 2: Reverse the second half of the list starting from slow pointer
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half with the reversed second half
        ListNode left = head;
        ListNode right = prev;  // The reversed second half of the list
        while (right != null) {
            if (left.val != right.val) {
                return false; // If values don't match, it's not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // If all values match, it's a palindrome
    }
}
