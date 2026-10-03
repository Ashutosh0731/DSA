class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            int digit = sum % 10;

            temp.next = new ListNode(digit);
            temp = temp.next;
        }

        return dummy.next;
        // int length1;
        // int length2;
        // ListNode size1 = l1, size2 = l2
        // while(size1 != null){
        //     size = size.next;
        //     length1++;
        // }
        // while(size2 != null){
        //     size = size.next;
        //     length2++;
        // }

        // int carry = 0;
        // ListNode temp1 = l1;
        // ListNode temp2 = l2;
        // while(temp1 != null && temp2 != null){
        //     if((temp1.val < 5) && (temp2.val <= 5) || (temp1.val <= 5) && (temp2.val < 5)){
        //         temp1.val = temp1.val+temp2.val+carry;
        //         carry = 0;
        //     }
        //     else{
        //         int n = (temp1.val+temp2.val) % 10;
        //         temp1.val = n+carry;
        //         carry = 1;
        //     }
        //     temp1 = temp1.next;
        //     temp2 = temp2.next;
        // }
        // return l1;
    }
}