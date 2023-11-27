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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode oddhead=null;
        ListNode oddtail=null;
        ListNode evenhead=null;
        ListNode eventail=null;
        int count=1;
        ListNode temp=head;
        while(temp!=null)
        {
            if(count%2==0)
            {
                if(evenhead==null)
                {
                    evenhead=temp;
                    eventail=temp;
                }
                else{
                    eventail.next=temp;
                    eventail=temp;
                }
            }
            else{
                if(oddhead==null)
                {
                    oddhead=temp;
                    oddtail=temp;
                }
                else{
                    oddtail.next=temp;
                    oddtail=temp;
                }
            }
            count++;
            temp=temp.next;
        }
        oddtail.next=evenhead;
        eventail.next=null;
        return oddhead;
    }
}