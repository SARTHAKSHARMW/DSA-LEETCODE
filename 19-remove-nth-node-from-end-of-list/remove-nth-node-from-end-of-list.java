class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Find length of list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: If we need to remove the head node
        if (n == length) {
            return head.next;
        }

        // Step 3: Move temp to (length - n)th node (prev)
        temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }

        // Step 4: Remove nth node from end
        ListNode del = temp.next;
        temp.next = del.next;   // like prev->next = temp->next in C

        return head;
    }
}
