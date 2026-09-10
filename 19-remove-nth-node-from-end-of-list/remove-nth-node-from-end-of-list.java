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
        if (head == null)
            return head;

        ListNode temp = head;
        if (n == 1) {
            if (temp.next == null) {
                head = null;
                return head;
            }
        }
        ListNode tail = head;
        int length = 0;
        while (tail != null) {
            tail = tail.next;
            length++;
        }
        if(n == length){
            head = head.next;
            return head;
        }
        for (int i = 0; i < length - n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}