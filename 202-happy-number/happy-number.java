
        // in happy problem we have n then we have to do the square of n and the term we achived  so the square sum of that digits also till we achieve 1 ; 
        // and if a number is continously inside a loop then it is not happy

        // for example you have 19 then // 19 mod 10 you will get 9 then do square of 9 then divide by 10 you will get one then mod it by 10 you will get 1 and square it ; do till you get zero;
        // if set already contains a number then return true else add the sum 

    import java.util.*;

public class Solution {

    private int getSquareSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Map<Integer, Boolean> map = new HashMap<>();

        while (n != 1) {
            if (map.containsKey(n)) {
                return false;
            }
            map.put(n, true);
            n = getSquareSum(n);
        }

        return true;
    }
}
// in hashmap
//import java.util.HashMap;

//public class Solution {

    // Function to calculate the sum of squares of digits
   // private int getSquareSum(int num) {
      //  int sum = 0;
       // while (num != 0) {
           // int digit = num % 10;
            //sum += digit * digit;
         //   num = num / 10;
       // }
       // return sum;
   // }

    // Function to check if the number is a happy number
   // public boolean isHappy(int n) {
        //HashMap<Integer, Boolean> map = new HashMap<>();

       // while (n != 1) {
         //   if (map.containsKey(n)) {
           //     return false; // cycle detected
           // }

         //   map.put(n, true); // mark current number as seen
         //   n = getSquareSum(n); // get next number in sequence
       // }

      //  return true;
  //  }
//}
