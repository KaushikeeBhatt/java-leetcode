class Solution {
    public int hammingDistance(int a, int b) {
        int c= a ^ b;
        int count=0;
        while(c!=0){
            count=count + (c&1);
            c>>=1;
        }
        return count;

    }
}