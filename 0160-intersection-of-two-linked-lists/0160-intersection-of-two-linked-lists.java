/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
            int i=0;        //i --> length
            ListNode current =head;
            while(current!=null){
                i++;
                current=current.next;
            }
            return i;
        }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=length(headA);
        int l2= length(headB);
        int a=Math.abs(l1-l2);
        if(l1>l2){
            while(a!=0){
                headA=headA.next;
                a--;
            }
        }
        else{
            while(a!=0){
                headB=headB.next;
                a--;
            }
        }
        while(headA!=headB){    
           headA=headA.next; 
           headB=headB.next;  
        }
        return headA;

    }
}