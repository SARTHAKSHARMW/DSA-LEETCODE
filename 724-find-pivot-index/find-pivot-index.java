
        //The pivot index is the index where the sum of all  the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
        ///////// a index a given and a left sum index is equal to the right index ; 

    // maeke two arrays left sum and right sum run the right sum throughout tha arrays and add each element and then set the left sum intially as 0 then subtract rightsum - leftsum and then leftsum ++ ;

    class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        // Step 1: Calculate total sum
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }

        int lsum = 0; // Left sum initially 0

        // Step 2: Traverse and compare left sum and right sum
        for (int i = 0; i < nums.length; i++) {
            int rsum = totalSum - lsum - nums[i]; // right sum

            if (lsum == rsum) {
                return i; // found pivot index
            }

            lsum = lsum + nums[i]; // update left sum
        }

        return -1; // no pivot index
    }
}

// this code means find the total sum or right sum and also put the leftsum at zero index then to find the right sum toal sum - rightsum - leftsum ; if lsum and rsum is same then yes we have found the pivot index and if not then lsum = lsum + nums[i] ; else return - 1; 



   



    
     
    