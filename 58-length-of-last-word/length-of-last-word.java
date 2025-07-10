public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                length++;  // count characters of the last word
            } else if (length > 0) {
                break;  // break when the last word is fully counted
            }
        }

        return length;
    }
}
