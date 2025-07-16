class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int index=0;index<nums.length*2;index++){
            int i=index%nums.length;
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                result[stack.pop()]=nums[i];
                
            }
            stack.push(i);
        }
        return result;
    }
}