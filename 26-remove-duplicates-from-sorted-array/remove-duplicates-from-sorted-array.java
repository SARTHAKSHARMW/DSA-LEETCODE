class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // last unique index

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // length of unique elements
    }
}
// so the main logic behind this code is that i=0 (0), j=1 (0) → duplicate → skip

//i=0 (0), j=2 (1) → new → i=1, nums[1]=1

//i=1 (1), j=3 (1) → duplicate → skip

//i=1 (1), j=5 (2) → new → i=2, nums[2]=2