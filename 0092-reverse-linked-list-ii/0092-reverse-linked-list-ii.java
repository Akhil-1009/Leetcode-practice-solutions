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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode prev=null;
        int count=1;
        while(count<left)
        {
            count++;
            prev=temp;
            temp=temp.next;
        }
        ListNode newHead=temp;
        while(count<right)
        {
            count++;
            temp=temp.next;
        }
        ListNode newtail=temp;
        ListNode temp2=temp.next;
        newtail.next=null;
        if(prev!=null)
        {
        prev.next=reverse(newHead);}
        else{
            head=reverse(newHead);
        }
        newHead.next=temp2;
        return head;
    }
}