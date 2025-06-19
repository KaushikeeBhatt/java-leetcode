class Solution {
    public String removeOuterParentheses(String s) {
        int a=-1;
        StringBuilder g = new StringBuilder();
        for(char c:s.toCharArray()){    
            if(c=='('){
                a++;
                if(a>0) g.append(c);
            }
            else if(c==')'){
                a--;
                if( a>-1) g.append(c);
            }
        }
        return g.toString();
    }
}