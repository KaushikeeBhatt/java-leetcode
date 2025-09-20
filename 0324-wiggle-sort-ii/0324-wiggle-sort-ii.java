class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int[] sorted=nums.clone();
        int left=(n-1)/2;
        int right=n-1;
        Arrays.sort(sorted);
        for(int i=0;i<n;i++){
            nums[i]=(i%2==0)?sorted[left--]: sorted[right--];
        }
    }
}