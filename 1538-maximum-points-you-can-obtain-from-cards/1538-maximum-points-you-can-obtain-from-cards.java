class Solution {
    public int maxScore(int[] card, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=card[i];
        }
        int r=sum;
        int l=0;
        int max=sum;
        int n=card.length;
        for(int i=k-1;i>=0;i--){
            r-=card[i];
            l+=card[n-1];
            n--;
            sum=r+l;
            max=Math.max(max,sum);
        }
        return max;
    }
}