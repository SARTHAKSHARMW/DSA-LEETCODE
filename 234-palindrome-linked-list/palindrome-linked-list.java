/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        //create the new stack 
        Stack<Integer> st = new Stack<>();
        //.value .next is defined in the question above hence we can say that 
        ListNode ptr = head ; 
        
        //traversing the elements inside the stack only e can say that 
        while(ptr != null){
            st.push(ptr.val);
            ptr = ptr.next; //till this the stack is filled  // means that push the elements of the linked list untill we reach the null pointer ; 


        }
        ListNode ptr2 = head ;
        while(ptr2 != null){
            int val1 = ptr2.val;
            int val2 = st.pop(); 

            if(val1 != val2){
                return false ; 
            }
            ptr2 = ptr2.next ; 

        } 
        return true ; 


    }
}