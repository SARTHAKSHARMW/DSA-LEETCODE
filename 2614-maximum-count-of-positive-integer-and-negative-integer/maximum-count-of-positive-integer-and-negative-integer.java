class Solution {
    public int maximumCount(int[] nums) {
        int lastNegIndex = lastNegative(nums);
        int firstPosIndex = firstPositive(nums);

        int countNegatives = lastNegIndex + 1;
        int countPositives = nums.length - firstPosIndex;

        return Math.max(countNegatives, countPositives);
    }

    // Helper function to find the index of the last negative number
    private int lastNegative(int[] nums) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                ans = mid;
                start = mid + 1;  // Move right to find the last negative
            } else {
                end = mid - 1;  // Move left
            }
        }

        return ans;
    }

    // Helper function to find the index of the first positive number
    private int firstPositive(int[] nums) {
        int start = 0, end = nums.length - 1;
        int ans = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;  // Move left to find the first positive
            } else {
                start = mid + 1;  // Move right
            }
        }

        return ans;
    }
}

// in first positivs and last negative we have to create three category 1) negative 2) non negative 3) positive integer ans = arr.length then we have to find the mid like bonary search if the mid is at non negative number like zero then to calcuate last negative do end = mid - 1 ; then calculate mid but the probelm is that the last negative number can be found only at the end of the negative integer so for that do start = mid + 1 ; ans same for positive number 