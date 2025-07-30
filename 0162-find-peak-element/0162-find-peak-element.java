class Solution {
    public int findPeakElement(int[] nums) {
        int h=nums.length-1;
        int l=0;
        while(l<h){
            int mid=(h+l)/2;
            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else{
                h=mid;
            }
            
        }
        return l;
    }
}