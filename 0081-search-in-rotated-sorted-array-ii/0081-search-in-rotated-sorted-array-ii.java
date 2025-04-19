class Solution {
    public boolean search(int[] nums, int target) {
        Set<Integer> set=new HashSet<>(Arrays.stream(nums).boxed().toList());
        if(set.contains(target)) return true;
        return false;
    }
}