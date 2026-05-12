class Solution {
    public boolean rotateString(String s, String goal) {
        String a=s+s;
        if(goal.length() != s.length() ) return false;
        if(a.contains(goal)) return true;
        return false;
    }
}