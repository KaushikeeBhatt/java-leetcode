class Solution {
    public int reverse(int x) {
        boolean p=false;
        if(x<0){
            x=x*(-1);
            p=true;

        }
        StringBuffer a= new StringBuffer(Integer.toString(x));
        a.reverse(); 
        try{int b= Integer.parseInt(a.toString());
        if(p==false)
        return b;
        else{
            return -b;
        }}
        catch (NumberFormatException e) {
            // If overflow occurs, return 0
            return 0;
        }
    }
}