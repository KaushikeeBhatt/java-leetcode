class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        if(num.charAt(n-1)%2!=0)return num;
        for(int i=n-1;i>=0;i--){
                if((int)num.charAt(i)%2!=0){
                    return num.substring(0,i+1);
                }
        }
        return "";
    }
}