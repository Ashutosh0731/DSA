class Solution {

    public int length(ListNode head) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int n = length(head);

        k = k % n;

        if (k == 0) {
            return head;
        }

        // tail tak jao
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        // circular linked list bana do
        tail.next = head;

        // new tail ki position
        int steps = n - k;

        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // new head
        ListNode newHead = newTail.next;

        // circle tod do
        newTail.next = null;

        return newHead;
    }
}