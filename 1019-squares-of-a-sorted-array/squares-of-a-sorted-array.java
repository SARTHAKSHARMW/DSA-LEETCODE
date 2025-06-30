class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // this is a bit logical question and requires good thinking 
        // so lets create a start and end pointer and a answer pointer where we have t if the value of starting pointer square is more than the end pointer we will put the square pointer in the last
        int [] ans = new int[nums.length]; 
        int start = 0;
        int end = nums.length - 1;

        int ptr = ans.length - 1;  // this is also present at the last where we have to store the value  
        while(start <= end){
            int ss =  nums[start] * nums[start]; // starting square
        int es =  nums[end] * nums[end]; 
        // ending square 

        if(ss > es){
            ans[ptr] = ss ; // means store the starting square at the ending as it might be the largest digit or number 
            start ++ ;

        }else{
            ans[ptr] = es;
            end-- ;
        }
        ptr -- ;
        }
        return ans ;
        
    }
}