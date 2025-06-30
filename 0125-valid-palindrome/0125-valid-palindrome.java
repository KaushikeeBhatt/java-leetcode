class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder g=new StringBuilder(s);
        StringBuilder p=new StringBuilder(s);
        g.reverse();
        return g.toString().equals(p.toString()) ;
    }

}