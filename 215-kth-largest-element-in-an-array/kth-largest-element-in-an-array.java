
        
        // in this question the main logic is that create a min heap till the kth element and at kth element create an array then check that if the k element is greater than the top element of the min heap if yes then remove that min heap element and put that k th element there 


        import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Step 1: Create a min heap of size k
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Step 2: Add first k elements
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }

        // Step 3: Process the rest of the elements
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }

        // The root of the heap is the kth largest
        return pq.peek();
    }
}

        

            

