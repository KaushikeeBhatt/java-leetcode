class Solution {
    public boolean checkOnesSegment(String s) {
        // boolean flag= false;
        // for(int i=s.length()-1;i>=0;i--){
        //     if(s.charAt(i)=='1'){
        //         flag=true;
        //     }
        //     if(flag==true && s.charAt(i)=='0'){
        //         return false;
        //     }
        //     }
        // return true;
        return !s.contains("01");
        }
    }
