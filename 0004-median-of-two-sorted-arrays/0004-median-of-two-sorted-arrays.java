class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] arr=new int[n];
        for(int i=0; i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=nums1.length; i<n;i++){
            arr[i]=nums2[j++];
        }
        Arrays.sort(arr);
        if(n%2!=0){
            return arr[n/2];
        }
        return (arr[n/2]+arr[n/2 - 1])/2.0;
    }
}