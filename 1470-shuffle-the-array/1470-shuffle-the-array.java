class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
       
        int a=0;
        for(int i=0;i<n;i++){
            arr[a++]=nums[i];
            arr[a++]=nums[n+i];
        }
        return arr;
    }
}