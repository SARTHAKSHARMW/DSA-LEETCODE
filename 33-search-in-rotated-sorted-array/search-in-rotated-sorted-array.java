//class Solution {
    //public int search(int[] nums, int target) {
        // in this one part must always be sorted array either the part before mid or after mid
        //simply means that if the after mid part is sorted then we have to sort before mid part so to do that we do end = mid - 1 ; and for vice versa start = mid  + 1 ; 
       // int start = 0 ;
       /// int end = nums.lenght - 1 ; 


        //while(start <= end){
      //      int mid = )start + end)/2 ; 
            
           // if(nums[mid] == target){
           ///     return mid ;
           // }else if(nums[start] <= nums[mid]){ // means first part is sorted checking the left sorted prt// 
             //   if(target >= nums[start]){
                   // end = mid - 1 ;
///
                //}else{
               //     start = mid + 1 ; 
                //}
           // }else{ // this is checking the right sorted part l 
               // if(target > nums[mid] && target <= nums[end]){
                  //  start = mid + 1 ; 
                //}//else{
                   // end = mid - 1 ; 
                //}

           // }
             //1st part is sorted l
        //}
       // return - 1; 
        

//}
//} 
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1; // ✅ Fix: typo was "lenght"

        while (start <= end) {
            int mid = (start + end) / 2; // ✅ Fix: typo was ")start + end)/2"

            if (nums[mid] == target) {
                return mid;
            }

            // ✅ Case 1: Left part is sorted
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // ✅ Case 2: Right part is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
