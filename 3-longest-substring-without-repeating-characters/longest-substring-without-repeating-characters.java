// a bit hard problem

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // Step 1
        int maxLen = 0;                 // Step 2
        int start = 0;                  // Step 3

        for (int end = 0; end < s.length(); end++) {    // Step 4
            char ch = s.charAt(end);                    // Step 5
            start = Math.max(start, lastIndex[ch]);     // Step 6
            maxLen = Math.max(maxLen, end - start + 1); // Step 7
            lastIndex[ch] = end + 1;                    // Step 8
        }

        return maxLen; // Step 9
    }
}
