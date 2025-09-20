class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // no cycle
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // meeting point inside cycle
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return null; // no cycle

        // Step 2: Use a distance pointer
        ListNode ptr = head; // new pointer at head

        while (ptr != slow) { // move both until they meet
            ptr = ptr.next;
            slow = slow.next;
        }

        return ptr; // cycle entry node
    }
}
