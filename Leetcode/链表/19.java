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
        ListNode quick = head;
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) {
            quick = quick.next;
        }
        while (quick != null){
            slow = slow.next;
            quick = quick.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }
}