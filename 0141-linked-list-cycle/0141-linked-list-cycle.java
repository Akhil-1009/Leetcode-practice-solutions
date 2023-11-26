/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head==null||head.next==null)
           return false;
        ListNode h=head;
        ListNode t=head;
        do{
            h=h.next.next;
            t=t.next;
            if(h==t)
            {
                return true;
            }
        }while(h!=null&&h.next!=null&&t!=null);
            return false;
    }
}