class Solution {
    public int maxProduct(int[] nums) {
        // we have to find max and smax and then multiply both the results (max-1)*(smax-1); 
        int max = -1;
        int smax = -1;
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] > max){
                smax = max ;
                max = nums[i];

            }else if(smax < nums[i]){
                smax = nums[i];
            }
                

            }
            int ans = (smax-1) * (max-1) ;

            return ans ;
        
         
    }
    }
