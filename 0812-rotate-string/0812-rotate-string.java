class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuffer s1=new StringBuffer(s);
        StringBuffer g1=new StringBuffer(goal);
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.toString().equals(g1.toString())){
                return true;
            }
            char o=s1.charAt(n-1);
            s1.deleteCharAt(n-1);
            s1.insert(0,o);
        }
        return false;
    }
}