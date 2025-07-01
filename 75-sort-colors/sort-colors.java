class Solution {
    public void sortColors(int[] nums) {
        // sort colours problem approach select three pointers low mid high and intialize their value if we will get the value of mid  = 0 then swap low and mid and also increse the pointer low ++ mid ++ if the value of the mid pointer is 1 then m ++ if the value of  midpointer is 2 then swap low and high and decrease the value of  the high pointer h-- intilaize the low and mid as zero and end as nums.length -1. we the objective of this is tp sort the array 


        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high ){
            if(nums[mid] == 0){
                swap(nums,low , mid) ;
                low ++ ;
                mid ++ ;


            }else if(nums[mid] == 1){
                mid ++ ;



            }else{
                swap(nums ,high ,mid) ;
                high -- ;
            }

             
        }






        
    }
    public void swap(int[] nums , int i , int j ) {
        int k = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = k ;
        
        
         // just for swapping is necessary 
         // so hence in this question we have to basically sort the array so to do that we set the value of mid as 0 1 and 2 and do swapping




    }
}