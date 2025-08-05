class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Handle base cases
        if (nums.length == 1) {
            return nums[0];
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Prevent index out of bounds
            if (mid > 0 && mid < nums.length - 1 &&
                nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid]; // Unique element found
            }

            // Ensure we align mid to the start of a pair
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Pair is valid, so move to the right half
                start = mid + 2;
            } else {
                // Pair is broken, unique element is to the left
                end = mid;
            }
        }

        // If loop exits, start will be at the single element
        return nums[start];
    }
}
// in this code first we check the neighbouring elements of the mid value after that will also check if the mid value  is odd which means that odd is end and even is start so when it is odd to get even we have to check the left hand side start = mid + 1 and even mid - 1 same for even conditon 

// for peak element check the left and right if the lef



urpose: Define search boundaries.

left → start of the array

right → end of the array

java
Copy
Edit
        while (left < right) {
Continue binary search until the search window narrows down to a single element.

When left == right, we’ve found the unique element.

java
Copy
Edit
            int mid = left + (right - left) / 2;
Calculate mid safely to avoid overflow.

(right - left) ensures no overflow when adding left.

java
Copy
Edit
            if (mid % 2 == 1) {
                mid--;
            }
Goal: Always make mid an even index.

Why?

Elements appear in pairs, and pairs should start at even indices.

If mid is odd, we shift it back by 1 to point to the first element of the pair.

java
Copy
Edit
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
Check if the current pair is valid:

If nums[mid] == nums[mid+1],

The single element is not in this pair, so move search window to the right side.

left = mid + 2 skips this pair.

Else

The pair is broken → single element is on or before mid,

right = mid.

java
Copy
Edit
        }
        return nums[left];
    }
}
Once left == right,

It means we've found the single element.

Return nums[left].
