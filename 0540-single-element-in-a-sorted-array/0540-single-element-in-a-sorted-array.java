class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        // Handle array of size 1
        if (e == 0) return nums[0];

        while (s < e) {
            int mid = s + (e - s) / 2;

            // Make sure mid is even so we always compare pairs (mid, mid+1)
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct, move right
                s = mid + 2;
            } else {
                // Mismatch in pair, move left
                e = mid;
            }
        }

        return nums[s];
    }
}
