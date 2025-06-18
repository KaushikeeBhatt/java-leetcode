class Solution {
    public int maxDepth(String s) {
        int max=0;
        int n=s.length();
        int a=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                a++;
            }
            if(s.charAt(i)==')'){
                a--;
            }
            max=Math.max(max,a);
        }
        return max;
    }
}