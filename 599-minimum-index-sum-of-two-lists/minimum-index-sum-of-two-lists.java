
        // use by using hashing and hashmap and hashtable 
        // so the basic concept hence the we have to find the comman element from 
        //both the strings and add the index of the strings simply; ans if the sum is less than minimum  list then we add that in the list otherwise not ; 
//1) create a array


import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add list1 elements to hashmap
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int minIndex = Integer.MAX_VALUE;

        // Iterate over list2 and check for common elements
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int indexSum = i + map.get(list2[i]);
                if (indexSum < minIndex) {
                    minIndex = indexSum;
                    result = new ArrayList<>();
                    result.add(list2[i]);
                } else if (indexSum == minIndex) {
                    result.add(list2[i]);
                }
            }
        }

        // Convert result list to array
        String[] ans = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
