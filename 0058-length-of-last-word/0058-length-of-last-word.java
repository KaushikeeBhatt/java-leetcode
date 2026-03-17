class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.length();
        if(n==1) return 1;
        int i=n-1;
        int l=0;
        while(i>=0&& s.charAt(i)!=' ' ){
            l++;
            i--;
        }
        return l;
    }
}