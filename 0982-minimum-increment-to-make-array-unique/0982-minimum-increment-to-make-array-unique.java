class Solution {
    public int minIncrementForUnique(int[] nums) {
        //greedy
        Arrays.sort(nums);
        int n=nums.length;
        //1 2 3 2 5 7
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                count += nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
            }
        }
        return count;
    }
}