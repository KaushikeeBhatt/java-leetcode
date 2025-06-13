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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode current=head;
        if (head == null || head.next == null || k == 0) return head;
        int l=1;
        while(current.next!=null){
            current=current.next;
            l++;
        }
        current.next=head;
        if(k>=l){
            k = k % l;
            }
        int n=l-k;
        current=head;
        while(n!=1){
            current=current.next;
            n--;
        }
        head=current.next;
        current.next=null;
        return head;

        
    }
}