public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                length++;  // count characters of the last word
            } else if (length > 0) { //this simply means that if there is any space between the charcaters then means  that we have calculated the length of the string e 
                break;  // break when the last word is fully counted
            }
        }

        return length;
    }
}
