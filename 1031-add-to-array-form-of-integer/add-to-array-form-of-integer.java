import java.util.*;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) { // refer to video solution and p and k > 0 and numsval = 0 and numsval = p ; and sum = numval + d + carry ; d = k % 10 ; then int digit = sum %10 ;  and carry = sum/10;
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.addFirst(k % 10);
            k /= 10;
        }

        return result;
    }
}





   