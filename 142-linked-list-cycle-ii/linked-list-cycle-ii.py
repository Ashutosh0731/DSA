class Solution(object):
    def detectCycle(self, head):
        if head is None:
            return head

        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if fast == slow:
                break

        # cycle nahi mila
        if fast is None or fast.next is None:
            return None

        # cycle ka starting node find karo
        b = head

        while b != slow:
            b = b.next
            slow = slow.next

        return b