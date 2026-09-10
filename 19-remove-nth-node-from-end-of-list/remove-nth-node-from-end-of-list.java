class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // More Clean Code
        if (head == null)
            return head;

        // 1. Length find kara
        ListNode tail = head;
        int length = 0;

        while (tail != null) {
            tail = tail.next;
            length++;
        }

        // 2. Agar first node hi delete karna hai toh yeah use use me ayega
        if (n == length) {
            head = head.next;
            return head;
        }

        // 3. Delete hone wale node ke previous node tak jao
        ListNode temp = head;

        for (int i = 0; i < length - n - 1; i++) {
            temp = temp.next;
        }

        // 4. Node delete
        temp.next = temp.next.next;
        System.gc();
        return head;

        // if (head == null)
        //     return head;

        // ListNode temp = head;
        // if (n == 1) {
        //     if (temp.next == null) {
        //         head = null;
        //         return head;
        //     }
        // }
        // ListNode tail = head;
        // int length = 0;
        // while (tail != null) {
        //     tail = tail.next;
        //     length++;
        // }
        // if(n == length){
        //     head = head.next;
        //     return head;
        // }
        // for (int i = 0; i < length - n - 1; i++) {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;

        // return head;
    }
}