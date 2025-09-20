class Solution {
    public void rotate(int[] nums, int k) {
        //765 4321
        int n=nums.length;
        k=k%n;
        if (k == 0) return;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
       // return nums;
    }
    public int[] reverse(int[] nums,int s,int e){
        while(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
        return nums;
    }
}