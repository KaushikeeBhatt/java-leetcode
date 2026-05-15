class Solution {
    public boolean isPalindrome(int x) {
        String a= Integer.toString(x);
        int p1=0;
        int p2=a.length()-1;
        while(p1<p2){
            if(a.charAt(p1)!=a.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
}