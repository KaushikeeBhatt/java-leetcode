class Solution {
    public int[] evenOddBit(int n) {
        int e=0;
        int o=0;

        while(n!=0){;
            if((n&1)==1){
                e++;
            }
            n>>=1;
            if((n&1)==1){
                o++;
            }
            n>>=1;
        }
        return new int[]{e,o};
    }
}