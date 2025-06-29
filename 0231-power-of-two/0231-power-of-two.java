class Solution {
    public boolean isPowerOfTwo(int n) {
        // recusrion

        // if(n==1) return true;
        // if(n==0 || n%2!=0) return false;
        // n=n/2;
        // return isPowerOfTwo(n);


        // bit manipulation
        if(n<=0) return false;
        if((n & (n-1))==0) return true;
        return false;

    }
}