class Solution {
    public int[] rearrangeArray(int[] nums) {
        // SO WE HAVE TO PLACE THE ELEMENTS IN SUCH A ORDER THAT IN MULTIPLES OF 2 MEANS IN ALTERNATE MANNER WE HAVE TO PLACE THE ELEMENTS ARRANGE FIRST THE POSITVE AND THE NEGATIVE ELEMENTS 
        int n = nums.length ;
        int [] ans = new int[n] ;
        int pos = 0; // the initial position of the postive number
        int neg = 1; 

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i] ; 
                pos = pos + 2 ; // simply means a postive number 

            }else{
                ans[neg] = nums[i];
                neg = neg + 2 ; 

            }
        }


        return ans  ;



        
    }
}