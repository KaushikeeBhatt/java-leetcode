class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] fr=new int[26];
        for(int n:word1.toCharArray()){
            fr[n -'a']++;
        }
        for(int n:word2.toCharArray()){
            fr[n-'a']--;
        }
        for(int q:fr){
            if(Math.abs(q) >3) return false;
        }
        return true;
    }
}