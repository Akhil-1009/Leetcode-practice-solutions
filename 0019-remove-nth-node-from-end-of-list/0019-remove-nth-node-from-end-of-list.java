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
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
       int count=(len-n)+1;
        if(count==1)
        {
            return head.next;
        }
        temp=head;
        int i=1;
        while(i<count-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}