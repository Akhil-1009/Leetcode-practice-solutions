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

    public int getDecimalValue(ListNode head) {
    // Initialize a pointer to the head node
    ListNode temp = head;

    // Initialize a variable to keep track of the decimal value
    int num = 0;

    // Traverse the linked list
    while (temp != null) {
        // Add the current node's value to the decimal value
        num = (num * 2) + temp.val;

        // Move on to the next node
        temp = temp.next;
    }

    // Return the final decimal value
    return num;
}
}