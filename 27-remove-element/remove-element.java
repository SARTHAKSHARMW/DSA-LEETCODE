class Solution {
    public int removeElement(int[] nums, int val) {
         // to remove a number we start a pointer if the value of pointer is not equal to value we move the pointer forward 
        int ptr = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                nums[ptr] = nums[i] ; // means that if the value of pointer is not equal to the val then move the pointer forward 
                ptr ++ ;
            }

        }  
        return ptr ;

            }

        }
    