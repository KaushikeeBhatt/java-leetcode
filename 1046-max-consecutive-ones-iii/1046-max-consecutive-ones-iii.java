class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;int zero=0;int r=0;int count=0; int max=0;
        while(r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            
            if(zero>k){
                if(nums[left]==0) zero--;
                left++;
            }
            if(zero<=k){
                count=r-left+1;
                max=Math.max(max,count);
            }
            r++;
        }
        return max;
    }
}