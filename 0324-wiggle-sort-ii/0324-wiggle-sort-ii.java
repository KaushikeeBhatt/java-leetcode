import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int left = (n - 1) / 2; // end of smaller half
        int right = n - 1;      // end of larger half

        for (int i = 0; i < n; i++) {
            nums[i] = (i % 2 == 0) ? sorted[left--] : sorted[right--];
        }
    }
}
