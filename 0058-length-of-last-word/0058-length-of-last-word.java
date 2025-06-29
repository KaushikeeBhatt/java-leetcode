class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(!s.contains(" ")){
            return s.length();
        }
        return lengthOfLastWord(s.substring(s.indexOf(" ")+1));
    }
}