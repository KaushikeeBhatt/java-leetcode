class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        StringBuilder b=new StringBuilder(a);
        b.reverse();
        return (a.equals(b.toString()));
    }
}