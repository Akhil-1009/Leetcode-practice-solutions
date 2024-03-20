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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
        int count=0;
        while(count<a-1)
        {
            temp1=temp1.next;
            count++;
        }
        ListNode prev=temp1;
        while(count<b)
        {
            temp1=temp1.next;
            count++;
        }
        
        ListNode nextp=temp1.next;
        temp1.next=null;
        prev.next=list2;
        temp2.next=nextp;
        return list1;
        
    }
}