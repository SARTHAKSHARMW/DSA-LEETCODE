
//using stack questions 
//using the logic of array and stacks in this approcach of question in which you have to read the array from the right side and if the element is greater or equal to the elements present in the stack   then pop those elements else push those elements in the stack 
//if the stack is empty and return -1 else peek the top of the stack 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1];

        for (int i = 0; i < n1; i++) {
            int num = nums1[i];
            int next = -1;

            // find position of num in nums2
            int pos = -1;
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == num) {
                    pos = j;
                    break;
                }
            }

            // scan to the right of pos to find the first greater element
            for (int j = pos + 1; j < n2; j++) {
                if (nums2[j] > num) {
                    next = nums2[j];
                    break;
                }
            }

            result[i] = next;
        }
        return result;
    }
}
