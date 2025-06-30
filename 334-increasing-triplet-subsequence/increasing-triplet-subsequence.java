//class Solution {
 //   public boolean increasingTriplet(int[] nums) {
       // int first = Integer.MAX_VALUE ;
      //  int second = Integer.MAX_VALUE ; // declare the first second and third as the maximum vakue elemets 
       // int third = Integer.MAX_VALUE ;

       // for(int i = 0 ; i <= nums.length ; i++){

          //  int ele = nums[i];

       // if(ele <= first){ // this code simply means that if the first variable is greater than element then it is the first element and if second element is greater than element than the element is second in the sequence and same for third oe also
          //  ele = first ; 
        //}else if(ele <= second){
       //     ele = second ;
       // }else{
       //     ele = third ;
        //    return true ;
       // }  




        //}
       // return false ;
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // update smallest so far
            } else if (num <= second) {
                second = num; // update second smallest
            } else {
                // found a number greater than both -> triplet exists
                return true;
            }
        }

        return false;
    }
}


        

        


        
    
