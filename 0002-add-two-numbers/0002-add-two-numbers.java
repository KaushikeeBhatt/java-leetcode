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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode tail=head;
        int carry =0;
        while(l1!= null || l2 != null || carry!=0 ){
            int a= (l1 != null )?l1.val : 0;
            int b= (l2 != null )?l2.val : 0;
            int sum=a+b+carry;
            carry=sum/10;
            ListNode newNode = new ListNode();
            newNode.val=(sum%10);
            tail.next=newNode;
            tail=newNode;
            ;
            l1= (l1!= null)?l1.next:null;
            l2= (l2!= null)?l2.next:null;
        }
        return head.next;
    }
}