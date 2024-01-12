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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode node = dummy;
        while (node.next != null && node.next.next != null) {
            ListNode start = node.next;
            ListNode end = node.next.next;
            node.next = end;
            start.next = end.next;
            end.next = start;
            node = start;
        }
        return dummy.next;


    }
}