class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s= new StringBuilder(Integer.toString(x));
        StringBuilder a= new StringBuilder(s);
        s.reverse();
        return a.toString().equals(s.toString());
    }
}