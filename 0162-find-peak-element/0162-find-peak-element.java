class Solution {
    public int findPeakElement(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        for(int  i=nums.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                if(stack.peek()>nums[i])  return i+1;
            }
            stack.push(nums[i]);
        }
        return 0;
    }
}