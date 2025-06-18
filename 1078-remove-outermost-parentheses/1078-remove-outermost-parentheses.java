class Solution {
    public String removeOuterParentheses(String s) {
        int a=0;
        String g="";
        for(char c:s.toCharArray()){
            
            if(c=='('){
                a++;
                if(a!=1) g+=c;
            }
            else if(c==')'){
                a--;
                if( a!=0) g+=c;
            }
            

        }
        return g;
    }
}