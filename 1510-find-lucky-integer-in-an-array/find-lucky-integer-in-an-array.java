import java.util.HashMap;

public class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = -1;

        for (int ele : arr) {
            if (hm.containsKey(ele)) { // means that if the hashmap already contains that element the increase the count of hashmap by 1 
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) == key) { // if hashmap contains element equals to it its key then return max ans otherwise return - 1;
                ans = Math.max(ans, key);
            } 
        }

        return ans;
    }
}

    
