class Solution {
    public int missingNumber(int[] nums) {
        // so in missing range problem we have to calculate the range and actual sum by n(n+1)/2 and then also current sum and then subtract from 
        int range = nums.length ;
        int actualSum = range * (range + 1)/2 ;
        int currSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
          currSum = currSum + nums[i];  


        }
        int ans  = actualSum - currSum ;

        return ans;

    }
}