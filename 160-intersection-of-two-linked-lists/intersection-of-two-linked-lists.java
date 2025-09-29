/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//first make a size of the linked list function and if the six
//so in this problem we have two linked list and we have link teh two linked list 

//so to that traverse through both the list a and list b and after that find the difference 
//if difference is positive hence the list1 is having more elements hence start from the next element of the list 1 
//if the difference is negative means that the list 2 is having more nodes or element hence start from the next node of the the list 2 that is ptr2 = ptr2.next ; 

//if same then simply move both the list together and intersect them ; 

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Step 1: Count lengths of both lists
        int lenA = 0, lenB = 0;
        ListNode ptr1 = headA, ptr2 = headB;
        
        while (ptr1 != null) { lenA++; ptr1 = ptr1.next; }
        while (ptr2 != null) { lenB++; ptr2 = ptr2.next; }
        
        // Step 2: Calculate difference
        int diff = Math.abs(lenA - lenB);
        
        // Step 3: Move the longer list's pointer ahead by diff
        ptr1 = headA;
        ptr2 = headB;
        if (lenA > lenB) {
            while (diff-- > 0) ptr1 = ptr1.next;
        } else {
            while (diff-- > 0) ptr2 = ptr2.next;
        }
        
        // Step 4: Move both pointers together until intersection or end
        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) return ptr1; // Intersection found
            ptr1 = ptr1.next;
            ptr2 = ptr2.next; 
        }
        
        // No intersection
        return null ; 
    
    }
}
//SIMPLY MEANS THAT IF THE DIFFERENCE BETWEEN THE LIST IS POSITIVE THEN SIMPLY MOVE THE PTR1 FORWARD ELSE IF THE DIFFERENCE IS NEGATIVE THEN MOVE PTR2 FORWARD = PTR2 = PTR2.NEXT ; 


//in this i
