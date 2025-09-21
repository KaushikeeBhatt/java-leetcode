class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        //1 345 1 25
        Arrays.sort(s);
        int count=0;
        int i=0;
        int j=0;
        while(j<s.length && i<g.length){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }
            else  j++;
        }
        return count;
    }
}