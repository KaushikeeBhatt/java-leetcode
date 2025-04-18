class Solution {
    public int maxArea(int[] height) {
      int p1=0;
      int p2=height.length-1;
      int res=0;
      while(p1<p2){
        int r=(Math.min(height[p1],height[p2]))*(p2-p1);
        res=Math.max(res,r);
        if(height[p1]<height[p2]) p1++;
        else p2--;
      }  
    return res;
    }
}