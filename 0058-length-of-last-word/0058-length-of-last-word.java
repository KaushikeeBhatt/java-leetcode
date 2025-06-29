class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(!s.contains(" ")){
            return s.length();
        }
        int i=s.indexOf(" ");
        return lengthOfLastWord(s.substring(i+1));
    }
}