
        // SO IN THIS PROBLEM in short we have to find the first decreasing element 
       //1)// Find the first decreasing element

//int i = n - 2;
//while (i >= 0 && nums[i] >= nums[i + 1]) {
    //i = i - 1;
//}
//Start from the second last element and move left.

//Find the first position i where nums[i] < nums[i + 1].

//Example nums = [1, 2, 3]:

//Start: i = 1 (nums[1] = 2)

//Check: nums[1] >= nums[2] → 2 >= 3 ❌ (false) → stop

//i = 1 (This is the element we can increase for the next permutation).
        
  //  }
//}
//FROM THIS POINT WE HAVE TO FOUND THE FRIST DECREASING ELEMENT AND FIND I THEN AFTER FINDING I 
// WE HAVE TO FIND SMALLEST LARGER ELEMENT THAN NUMS[I] AND AFTER FINDING THAT WE SWAP THE ELEMENTS AND REVERSE THE ELEMENTS OF THE ARRAY
//2)Find next greater element on rightt
//if (i >= 0) {
   // int j = n - 1;
    //while (j >= 0 && nums[j] <= nums[i]) {
      //  j = j - 1;
    //}
    //swap(nums, i, j);
//}
//If we found i, we need to find the smallest number larger than nums[i] on the right side.

//Start from the last element and move left to find j.

//Example:


//i = 1 (nums[1] = 2)

//Start: j = 2 (nums[2] = 3)

//Check: nums[2] <= nums[1] → 3 <= 2 ❌ → stop

//j = 2

//Swap nums[i] and nums[j]:

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first decreasing element from right
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i = i - 1;
        }

        // Step 2: If found, find the next greater element from right
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j = j - 1;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse from i+1 to end
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start = start + 1;
            end = end - 1;
        }
    }
}
