class Solution {
    public int findPeakElement(int[] nums) {
        // A peak element is greater than its neighbors

        // Base case: single element
        if (nums.length == 1) {
            return 0;
        }

        // Check the first element
        if (nums[0] > nums[1]) {
            return 0;
        }

        // Check the last element
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        // Binary search in the middle of the array
        int start = 1;  // we already checked index 0
        int end = nums.length - 2; // we already checked last index

        while (start <= end) {
            int mid = (start + end) / 2;

            // If mid is greater than both neighbors, it's a peak
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // If mid is less than right neighbor, move right
            else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
            // Else move left
            else {
                end = mid - 1;
            }
        }

        // Control should never reach here in a valid input
        return -1;
    }
}
