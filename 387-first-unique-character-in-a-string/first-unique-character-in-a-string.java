
        // using hashmap and we have to find that element that is unique and doesnt repeat itself 
        import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // ✅ Step 1: Count frequencies (must use regular for-loop for charAt)
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // ✅ Step 2: Find first unique char (need index, so use normal loop)
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}


//simply we have checked that we have set each count of the element in the string as 1 and if any element repeats then its count is +1 ; else 1 ; 
        


        
   