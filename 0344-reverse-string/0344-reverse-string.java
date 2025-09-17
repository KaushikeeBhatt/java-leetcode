class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int n=s.length-1;
        while (a <= n){
            char b=s[a];
            s[a]=s[n];
            s[n]=b;
            a++;
            n--;
        }
    }
}