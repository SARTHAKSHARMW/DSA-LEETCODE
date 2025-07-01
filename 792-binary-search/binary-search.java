class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1 ;
        


        while(start <= end){ // basic research for binary search code 
        int mid = (start + end)/2 ;

        if(nums[mid] == target){
            return mid ;
        }else if(target > nums[mid]){
            start = mid +1; // means to get the target at larger  number 
        }else{
            end = mid - 1;
        }
            

        }
        return - 1;
        
    }
}