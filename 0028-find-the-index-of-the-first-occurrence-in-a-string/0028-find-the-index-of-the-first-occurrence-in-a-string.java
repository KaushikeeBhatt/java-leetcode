class Solution {
    public int strStr(String haystack, String needle) {
        int p1=0;
        int p2=0;
        while(p2!=needle.length() && p1<haystack.length()){
            if(haystack.charAt(p1)==needle.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                p1=p1-p2+1;
                p2=0;
            }
        }
        if(p2==needle.length()){
            return p1-needle.length();
        }
        return -1;
    }
}