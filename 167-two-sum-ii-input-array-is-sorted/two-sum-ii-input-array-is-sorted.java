class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // good thing is that the array is sorted so we have to arrange it according to that only 
        int [] ans = new int [2];
        int start = 0;
        int end = numbers.length - 1 ;

        while(start <= end ){
            int sum = numbers[start] + numbers[end] ;

            if(sum == target){
                ans[0] = start + 1; // in two sum 1 ; ans[0] = i
                // ans[1]= j

                ans[1] = end + 1 ;
                 
                 return ans ;

            }else if(sum > target ){ /// means if the sum is greater hence the target will be found at starting or less digits 
                end -- ;


            }else{ // means that 
                start ++ ;
            
        }
        }
        return ans ; // so basically take two poointers 
        // in this if we found the target we have to increase the index by 1 ; 
    }
}
        
    
        
    
