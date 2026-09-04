class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            ListNode next = curr.next; // next node save
            curr.next = prev;          // link reverse

            prev = curr;               // prev aage
            curr = next;               // curr aage
        }

        return prev;
    }
}