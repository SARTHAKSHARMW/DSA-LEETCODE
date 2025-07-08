
        // in jewels and stone will use hashtable 

        import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Boolean> map = new HashMap<>();

        // Step 1: Store all jewels in the map
        for (char ch : jewels.toCharArray()) {
            map.put(ch, true);
        }

        // Step 2: Count jewels in stones
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (map.containsKey(ch)) {
                count++;
            }
        }

        return count;
    }
}

        
    