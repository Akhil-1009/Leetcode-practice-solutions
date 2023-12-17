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
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null&& k!=0){
            if(curr.next==null){
                curr.next=head;
                prev.next=null;
                k--;
                head=curr;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}