class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
       
        int a=0;
        for(int i=0;i<n;i++){
            arr[a]=nums[i];
            arr[a+1]=nums[n+i];
            a=a+2;
        }
        return arr;
    }
}