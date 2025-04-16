class Solution {
    public int firstMissingPositive(int[] num) {
        Arrays.sort(num);
        Set<Integer> nums=new LinkedHashSet<>();
        
        for(int n:num){
            nums.add(n);
        }
        int[] arr=new int[nums.size()];
        int ii=0;
        for(int n:nums){
            arr[ii++]=n;
        }
        int p=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1) continue;
            else{
                if(arr[i]!=p) return p;
            }
            p++;
        }
        return p;
    }
}