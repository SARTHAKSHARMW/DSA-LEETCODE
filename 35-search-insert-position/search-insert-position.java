class Solution {
    public int searchInsert(int[] nums, int target) {
        // WE WILL SOLVE USING BINARY SEARCH ; 
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        
        return left; // target not found
    }

        
        


    }
