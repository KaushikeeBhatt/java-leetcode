class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(map.containsKey(t)&& map.get(t)!=i){
                arr[0]=i;
                arr[1]=map.get(t);
                return arr;
            }

        }
        return null;
    }
}