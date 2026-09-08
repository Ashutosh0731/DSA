public class Solution {
    public boolean hasCycle(ListNode head) {

       if(head == null) return false;

        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false; 
        
        
        // if(head == null || head.next == null) return false;

        // ListNode fast = head;
        // ListNode slow = head;
        
        // do{
        //     slow = slow.next;
        //     fast = fast.next.next;
        //     if(slow == fast) return true;
        // }while (fast != null && fast.next != null);
        // return false;
    }
}