class Solution {
    public int romanToInt(String s) {
        char[] a=s.toCharArray();
        int result =0;
        int m=0;
        int prev=0;
        for(int i=a.length-1;i>=0;i--){
            switch(a[i]){
                case 'I': m = 1; break;
                case 'V': m = 5; break;
                case 'X': m = 10; break;
                case 'L': m = 50; break;
                case 'C': m = 100; break;
                case 'D': m = 500; break;
                case 'M': m = 1000; break;
            }
        
            if(prev<=m){
                result+=m;                
                }
            else{
                result-=m;
            }

            prev=m;
        }
        return result;
    }
}