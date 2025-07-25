//c//lass Solution {
  //  public int findMin(int[] nums) {
   //     // we have to calculate the 
       // if(nums.length == 1){
         //   return nums[0];
       // }else if(nums[0] < nums.length - 1){
           // return nums[0]; 
            // minimum means that the element is smaller than its neighbour 
            // in sorted array one part always much be sorted 
            // min element is always present in the unsorted part ;
            // to check which part is unsorted check if the previous element is less than the mid then it can be called as te unsorted part ; 
          //  int start = 0 ;
         ///   int end  = nums.length - 1 ; 

         //   while(start <= end){
            //    int mid = (start + end)/2 ; 

             //   if(mid != 0  && nums[mid -1 ] > nums[mid]){ // means the previous element is greater than the mid means that is the unsorted part of the arrya then we can say that mid can be the minimum element 
               // }else if( mid != nums.length  - 1  && nums[mid] > nums[mid + 1]){
                  //  return nums[mid + 1] ; 
                    // means that the mid part is greater than the next element then we can say that nums[mid+1] is the smallest elment 
          //  }else if(nums[start] <= nums[mid]){ //. this is the sorted part of the code which we do not have to touch 
               // start = mid + 1 ; 
                
           // }else{
              //  end = mid  - 1; 
          //  }




    //    }
  //  }
  //  return -1 ; 
        
 //   }
///}




//class Solution {
    //public int findMin(int[] nums) {
        // we have to calculate the 
        //if(nums.length == 1){
           // return nums[0];
      //  }

        // If the array is not rotated (fully sorted)
        //if(nums[0] < nums[nums.length - 1]){
          //  return nums[0]; 
        //}

        // minimum means that the element is smaller than its neighbour 
        // in sorted array one part always must be sorted 
        // min element is always present in the unsorted part ;
        // to check which part is unsorted check if the previous element is less than the mid then it can be called as the unsorted part ; 
        //int start = 0 ;
        //int end  = nums.length - 1 ; 

       // while(start <= end){
            //int mid = (start + end)/2 ; 

           // if(mid != 0 && nums[mid -1 ] > nums[mid]){
                // means the previous element is greater than the mid means that is the unsorted part of the array then we can say that mid can be the minimum element 
               // return nums[mid] ;
           // }else if(mid != nums.length - 1 && nums[mid] > nums[mid + 1]){
               // return nums[mid + 1] ; 
                // means that the mid part is greater than the next element then we can say that nums[mid+1] is the smallest element 
            //}else if(nums[start] <= nums[mid]){
                // this is the sorted part of the code which we do not have to touch 
             //   start = mid + 1 ; 
          //  }else{
             //   end = mid - 1; 
          //  }
       // }

      //  return -1 ; 
   // }
//}
////

class Solution {
    public int findMin(int[] nums) {
        // we have to calculate the 
        if(nums.length == 1){
            return nums[0];
        }

        // If the array is not rotated (fully sorted)
        if(nums[0] < nums[nums.length - 1]){
            return nums[0]; 
        }

        // minimum means that the element is smaller than its neighbour 
        // in sorted array one part always must be sorted 
        // min element is always present in the unsorted part ;
        // to check which part is unsorted check if the previous element is less than the mid then it can be called as the unsorted part ; 
        int start = 0 ;
        int end  = nums.length - 1 ; 

        while(start <= end){
            int mid = (start + end)/2 ; 

            if(mid != 0 && nums[mid -1 ] > nums[mid]){
                // means the previous element is greater than the mid means that is the unsorted part of the array then we can say that mid can be the minimum element 
                return nums[mid] ;
            }else if(mid != nums.length - 1 && nums[mid] > nums[mid + 1]){
                return nums[mid + 1] ; 
                // means that the mid part is greater than the next element then we can say that nums[mid+1] is the smallest element 
            }else if(nums[start] <= nums[mid]){
                // this is the sorted part of the code which we do not have to touch 
                start = mid + 1 ; 
            }else{
                end = mid - 1; 
            }
        }

        return -1 ; 
    }
}
