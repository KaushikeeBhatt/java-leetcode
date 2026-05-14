class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] a=s.toCharArray();
        char[] q=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(q);
        return Arrays.equals(a,q);
    }
}