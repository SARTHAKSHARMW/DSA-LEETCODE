class Solution {
    public int dominantIndex(int[] nums) {
        int [] arr = new int [100];
        int max = -1 ;

        int smax = -1 ;
        int maxId = 0;

        for(int i = 0 ; i < nums.length ; i++){
        
        if(max < nums[i]){
            smax = max ;
            max = nums[i];
            maxId = i;

        }else if(smax  < nums[i]){
            smax = nums[i];
        }
        }
        if(smax * 2 <= max){
            return maxId ;// maxId found at which positon of the array 
        }else{
            return -1 ;
        }
    }
}

        
    
