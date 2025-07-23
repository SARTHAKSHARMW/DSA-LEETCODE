//import java.util.HashMap;

//class Solution {
    //public boolean containsNearbyDuplicate(int[] nums, int k) {
       /// HashMap<Integer, Integer> map = new HashMap<>();

        // First pass: store the last index of each number
       // for (int i = 0; i < nums.length; i++) {
         //   map.put(nums[i], i);
       // }

        // Second pass: check again for duplicates within distance k
        //for (int i = 0; i < nums.length; i++) {
            ///if// (map.containsKey(nums[i])) {
                //int j = map.get(nums[i]);

                // Ensure i and j are different indices and check the distance
               // if (i != j && Math.abs(i - j) <= k) {
                 //   return true;
              //  }
           /// }
      //  }

        //return false;
////    }
//}


import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // always update with latest index
        }

        return false;
    }
}


