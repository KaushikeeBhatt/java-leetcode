class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr= s.split("\\s+");
        String a="";

        for(int i=arr.length-1;i>=0;i--){
            a=a+arr[i];
            if(i!=0){a+=" ";}
        }
        return a;
    }
}