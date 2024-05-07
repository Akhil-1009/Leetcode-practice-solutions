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
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        int carry=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {    ListNode next=temp.next;
            int sum=(2*temp.val)+carry;
            temp.val=sum%10;
            carry=sum/10;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            newnode.next=prev;
            prev=newnode;
        }
        return prev;
    }
}