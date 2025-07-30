class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int s=0;
        int index=-1;
        int e= nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]>=target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            if(nums[mid]==target) index=mid;
        }
        int i=index;
        int l=0;int h=nums.length-1;
        while(l<=h){
            int mid=(h+l)/2;
            if(nums[mid]<=target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            if(nums[mid]==target) index = mid;
        }
        int j=index;
        return new int[]{i,j};
            
    }
}