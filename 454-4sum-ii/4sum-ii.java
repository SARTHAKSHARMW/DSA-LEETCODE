//public class Solution {
   // public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
       // int count = 0;

       // for (int i = 0; i < nums1.length; i++) {
            //f//or (int j = 0; j < nums2.length; j++) {
               // for (int k = 0; k < nums3.length; k++) {
                    //for (int l = 0; l < nums4.length; l++) {
                        //if (nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0) {
                        //    count++;
                     //   }
                 ///  // }
        //        }
         ///   }
     //   }

       // return count;
    //}
//}
// big of o power 4 ; 


// like we have to find find a[i] + b[j] + c[k] + d[l] = 0 that also means that a[i] + b[j] = - (c[k] + d[l]) ; 

// make a map  <- a,+ b and find the count 
// then check wheather -c+d is present in the map and count 
//nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
//⇒ (nums1[i] + nums2[j]) == -(nums3[k] + nums4[l]) ; 




import java.util.HashMap;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Store all possible sums of nums1[i] + nums2[j] and their frequencies
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // For each sum in nums3 and nums4, check if the negated sum exists in the map
        for (int c : nums3) {
            for (int d : nums4) {
                int target = -(c + d);
                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }

        return count;
    }
}
 /// simply meand 



