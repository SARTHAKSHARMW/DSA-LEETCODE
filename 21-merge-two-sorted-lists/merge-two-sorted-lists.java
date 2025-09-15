class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);  // fixed start
        ListNode ans = dummy;               // moving pointer

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ans.next = list1;
                list1 = list1.next;
            } else {
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next; // move forward
        }

        // attach remaining nodes
        if (list1 != null) ans.next = list1;
        if (list2 != null) ans.next = list2;

        return dummy.next; // skip dummy and return actual head
    }
}
