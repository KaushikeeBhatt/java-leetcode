class Solution {
    public boolean checkZeroOnes(String s) {
     int o=0;
     int z=0;
     int max1=0;
     int max2=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            o++;
            z=0;
        }
        if(s.charAt(i)=='0'){
            z++;
            o=0;
        }
        max1=Math.max(max1,o);
        max2=Math.max(max2,z);
     }
     return (max1>max2)?true:false;
    }
}