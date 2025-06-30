class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int p=0;
        int q=1;
        for(int num:nums){
            if(num<0){
                arr[q]=num;
                q=q+2;
            }
            else{
                arr[p]=num;
                p=p+2;
            }
        }
        return arr;
    }
}