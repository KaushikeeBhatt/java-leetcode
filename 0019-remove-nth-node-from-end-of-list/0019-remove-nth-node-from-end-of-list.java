/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode current=head;
        while(current!=null){
            i++;
            current=current.next;
        }
        if(i==n){
            return head.next;
        }
        current =head;
        int k=1;
        while(k!=i-n){
            current=current.next;
            k++;
        }
        current.next=current.next.next;
        return head;
    }
}