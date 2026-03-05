class Solution {
    public int minOperations(String s) {
    int swap1=0;
    int swap2=0;
    for(int i=0;i<s.length();i++){
        char expected1= (i%2==0)?'0':'1';
        char expected2= (i%2==0)?'1':'0';
        if(s.charAt(i)!=expected1){
            swap1++;
        }
        if(s.charAt(i)!=expected2){
            swap2++;
        }
    }
    return Math.min(swap1,swap2);   
    }
}