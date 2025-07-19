class Solution {
    public int compress(char[] chars) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(chars[i]);
                count = 1;
            } else {
                count++;
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
