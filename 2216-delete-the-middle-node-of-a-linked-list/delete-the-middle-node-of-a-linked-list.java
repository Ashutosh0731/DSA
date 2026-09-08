class Solution {
    public ListNode deleteMiddle(ListNode head) {
       
       if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
       
       
       
       
       
        // if(head == null || head.next == null){
        //     return null;
        // }

        // ListNode temp = head;
        // int length = 0;
        // while(temp != null){
        //     length++;
        //     temp = temp.next;
        // }
        // temp = head;
        // int mid = length/2;
        
        //     for(int i = 0; i < mid - 1; i++){
        //         temp = temp.next;
        //     }
        //     temp.next = temp.next.next;

        // return head;
    }
}