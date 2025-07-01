class Solution {
    public List<Integer> targetIndices(int[] nums, int target) { // array list of intger taken we take a num and total count variable which 
        int num = 0 ; 
        int tcount = 0 ;

        for(int ele : nums){
            if(ele == target){ // simply means that if ele is found at tatget so we increase the the value of tcount by 1 
                tcount ++ ;
            }else if(ele < target){
                num ++ ;
            }
            
            }
            List <Integer> ans = new ArrayList <> ();

            while(tcount > 0){ // when the total count is more than zero then add the num and num ++ them and start decreasing the tcount variable 
                ans.add(num);
                num ++ ;
                tcount -- ;
            }

            return ans ;
            


        

        
            

            
            
            


        }
    }
