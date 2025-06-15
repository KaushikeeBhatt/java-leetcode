public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s="";
        for(int i=0;i<32;i++){
            s=s+(n&1);
            n=n>>>1;
        }
        int q=(int)Long.parseLong(s,2);
        return q;
    }
}