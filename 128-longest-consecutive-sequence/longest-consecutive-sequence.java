//class Solution {
    //public int longestConsecutive(int[] nums) {
        // can be solved using hashmap and hashtable with concept of arrays ; 

    // we have to find the length of the longest consecutive sequence ;;
    // find the numbers that start the sequence ;;
    // so check the element before current element if that value is present then false if not then true and yes ; 

    // then  check the true element + 1 value if it is present then its the sequeunc e we have to find the maximum  length and else we will return the length of that element as 1;


//1)Creating a integer vs boolean hashmap

//HashMap<Integer,Boolean> hm = new HashMap <>(); 

//for(int i = 0 ; i < nums.length ; i++){
   // 
   // hm.put(nums[i], false) ; //create a hashmap and set the value intially as false
//}//
//for(int key : hm.keySet(){ // checks all the keys anf values of the array or hashmap


//if(hm.containsKey(key -1) == false)){ // means that if the previous element is not present then return as true means they can be a sequence ; 
//hm.put(key,true) ; 


//} // now for true part ; 

//int max = 0 ; 

//
//i//nt k = 1 ; // minmum value that stars the sequence 


//f//or(int key : hm.keySet(){ 
///
    //if(hm.get(key) == true) {

        //while(hm.containsKey(key + k) == true) {
            //k++ ; // add + 1 if truee then it is the sequence ; 
         //}
//

    //}
    //max = Math.max(max) ; 

////
//}
//return max ; 





        
  //  }
//}

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Step 1: Create HashMap<Integer, Boolean>
        HashMap<Integer, Boolean> hm = new HashMap<>();

        // Step 2: Mark all elements as false (not start of sequence yet)
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], false);
        }

        // Step 3: Check which elements are potential starts of sequence
        for (int key : hm.keySet()) {
            if (!hm.containsKey(key - 1)) {
                // if key-1 doesn't exist, key is a starting point
                hm.put(key, true);
            }
        }

        int max = 0;

        // Step 4: For each starting point, count length of sequence
        for (int key : hm.keySet()) {
            if (hm.get(key) == true) {
                int k = 1;
                while (hm.containsKey(key + k)) {
                    k++;
                }
                max = Math.max(max, k);
            }
        }
        return max ;
    }
}
