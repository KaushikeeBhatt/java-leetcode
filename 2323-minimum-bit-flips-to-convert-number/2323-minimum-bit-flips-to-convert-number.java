class Solution {
    public int minBitFlips(int start, int goal) {
        int a=start^goal;
        int count=0;
        while(a!=0){
            count=count+(a&1);
            a=a>>1;
        }
        return count;
    }
}