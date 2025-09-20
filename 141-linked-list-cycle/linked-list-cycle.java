class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // no cycle if list is empty or has only 1 node
        }

        ListNode slow = head;      // moves 1 step at a time
        ListNode fast = head;      // moves 2 steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move by 1
            fast = fast.next.next;     // move by 2

            if (slow == fast) {        // if they meet → cycle exists
                return true;
            }
        }

        return false; // reached end → no cycle
    }
}
