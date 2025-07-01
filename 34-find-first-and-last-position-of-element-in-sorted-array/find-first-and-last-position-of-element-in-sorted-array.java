//class Solution {
   // public int[] searchRange(int[] nums, int target) {
      //  int [] ans = {-1 , 1} ;
      //  if(nums.length == 0){
       //     return ans ;

       // }
        //int first = firstOccurence(nums,target);
       // int last  = lastOccurence(nums ,target) ;

       // return ans ;
        
   // }
    //public  int firstOccurence(int[] nums , int target){
       // int start = 0;
      //  int end = nums.length - 1;

       // while(start <= end) {
           // int mid = (start + end)/2 ;

           // if(nums[mid] == target){
              //  ans = mid ;
            //    end = mid - 1; // in last occurence start = mid +1 ;
           // }else if(target > nums[mid]){
          //      start = mid + 1 ;
          //  }else{
             //   end = mid - 1 ;
           /// }

     //   }
 //   }
//}
class Solution {
    public int[] searchRange(int[] nums, int target) { // first occurence select index  =1 and last occurence index = -1;
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target) index = mid;
        }

        return index;
    }

    private int findLast(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target) index = mid;
        }

        return index;
    }
}
