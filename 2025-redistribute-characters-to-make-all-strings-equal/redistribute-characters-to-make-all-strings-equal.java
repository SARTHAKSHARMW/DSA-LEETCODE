class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;

        // frequency array for 26 lowercase letters
        int[] fre = new int[26];

        // count each character
        for (int i = 0; i < words.length; i++) {
            String w = words[i];  // get each word

            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);  // get each character
                fre[ch - 'a']++;        // increase its frequency
            }
        }

        // check if all frequencies are divisible by number of words
        for (int i = 0; i < 26; i++) {
            if (fre[i] % n != 0) {
                return false;  // if not divisible, cannot make equal
            }
        }

        return true;  // all characters can be evenly divided
    }
}
