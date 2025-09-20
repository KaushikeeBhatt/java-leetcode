class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m;
        int p2=0;
        while(p1<m+n){
            nums1[p1]=nums2[p2];
            p1++;
            p2++;
        }
        Arrays.sort(nums1);
    }
}