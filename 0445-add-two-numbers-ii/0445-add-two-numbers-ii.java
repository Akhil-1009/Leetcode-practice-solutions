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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1 = reverse(l1);
        ListNode rev2 = reverse(l2);
        List<Integer> al = new ArrayList();
        int sum = 0;
        int rem = 0;
        while(rev1 != null && rev2 != null) {
            sum = rem + rev1.val + rev2.val;
            if(sum >= 10) {
                al.add(sum % 10);
                rem = sum / 10;
            } else {
                al.add(sum);
                rem = 0;
            }
            rev1 = rev1.next;
            rev2 = rev2.next;
        }
        while(rev1 != null) {
            if(rem != 0) {
                sum = rem + rev1.val;
                if(sum >= 10) {
                    al.add(sum % 10);
                    rem = sum / 10;
                } else {
                    al.add(sum);
                    rem = 0;
                }
            } else {
                al.add(rev1.val);
            }
            rev1 = rev1.next;
        }
        while(rev2 != null) {
            if(rem != 0) {
                sum = rem + rev2.val;
                if(sum >= 10) {
                    al.add(sum % 10);
                    rem = sum / 10;
                } else {
                    al.add(sum);
                    rem = 0;
                }
            } else {
                al.add(rev2.val);
            }
            rev2 = rev2.next;
        }
        if(rem != 0) {
            al.add(rem);
        }
        ListNode res = new ListNode();
        ListNode r = res;
        for(int i = al.size()-1; i >= 0; i--) {
            r.next = new ListNode(al.get(i));
            r = r.next;
        }
        return res.next;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}