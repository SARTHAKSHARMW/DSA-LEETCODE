class Solution {
    public String largestNumber(int[] nums) {
        // In largest number, we first convert the numbers to strings,
        // then sort them using a custom comparator. We compare s1 + s2 and s2 + s1,
        // and place the one which makes a larger number first.
        
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + ""; // Typecasting: converts int to String
        }

        // Custom sort: (s2 + s1).compareTo(s1 + s2) ensures descending order
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        // If the first character is '0', the entire number is zero
        if (sb.charAt(0) == '0') {
            return "0";
        } else {
            return sb.toString();
        }
    }
}
