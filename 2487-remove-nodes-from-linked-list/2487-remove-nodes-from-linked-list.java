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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        ListNode prev=null;
        int max=Integer.MIN_VALUE;
        while(temp!=null)
        {
            if(temp.val>=max)
            {  ListNode next=temp.next;
                temp.next=prev;
               prev=temp;
              max=temp.val;
                temp=next;
            }else{
             temp=temp.next;   
            }
        }
        return prev;
    }
}