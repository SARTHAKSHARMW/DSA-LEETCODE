class Solution {
    public int compress(char[] chars) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {   // Loop starts from 1 because we compare with the previous char
    if (chars[i] != chars[i - 1]) {        // If the current character is different from the previous
        if (count > 1) {                   // If the previous char was repeated
            sb.append(count);              // Add the number of occurrences to the result
        }
        sb.append(chars[i]);               // Add the new (different) character to the result
        count = 1;                         // Reset count for the new character
    } else {
        count++;                           // If same character continues, increment the count
    }
}


        // Append the count for the last group
        if (count > 1) {
            sb.append(count);
        }

        // Write back to the input array
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
