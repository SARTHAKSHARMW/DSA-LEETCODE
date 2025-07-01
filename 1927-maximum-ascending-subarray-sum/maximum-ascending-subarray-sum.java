class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

// code for maximum subarray sum without if else 
// all same except in if statement currsum =  Math.max(curr sum )
//public class MaxSubarraySum {
  //  public static void main(String[] args) {
      //  int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array

      //  int maxSum = findMaxSubarraySum(nums);
      //  System.out.println("Maximum Subarray Sum is: " + maxSum);
    //}

    //public static int findMaxSubarraySum(int[] nums) {
       // int currentSum = nums[0];
        //int maxSum = nums[0];

       // for (int i = 1; i < nums.length; i++) {
          //  currentSum = Math.max(nums[i], currentSum + nums[i]);
           // maxSum = Math.max(maxSum, currentSum);
       // }

       // return maxSum;
   // }
//}
// using if else statment 
//public class MaxSubarraySum {
    //public static void main(String[] args) {
        //int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array

        //int maxSum = findMaxSubarraySum(nums);
        //System.out.println("Maximum Subarray Sum is: " + maxSum);
    //}

    //public static int findMaxSubarraySum(int[] nums) {
        //int currentSum = nums[0];
        //int maxSum = nums[0];

        //for (int i = 1; i < nums.length; i++) {
            // Using if-else to decide whether to add current number or start new subarray
           // if (currentSum + nums[i] > nums[i]) {
            //   // currentSum = currentSum + nums[i]; // means that if the curr sum is less than next digit of nums[i] then add the nums[i] also
            //} else {
              //  currentSum = nums[i];
          //  }

            // Update maxSum if currentSum is greater
           // if (currentSum > maxSum) {
           //     maxSum = currentSum;
         //   }
      //  }

     //   return maxSum;
 //   }
//}

