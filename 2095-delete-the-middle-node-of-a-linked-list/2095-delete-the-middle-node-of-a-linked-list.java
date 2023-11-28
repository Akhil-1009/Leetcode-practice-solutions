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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode prev=head;
        ListNode t=head;
        ListNode  h=head;
        while(h!=null&&h.next!=null)
        {
            h=h.next.next;
            prev=t;
            t=t.next;
        }
        prev.next=t.next;
        t=null;
        return head;
    }
}