class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=0;
        for(Integer q:set){
            nums[i++]=q;
        }
        return set.size();
    }
}