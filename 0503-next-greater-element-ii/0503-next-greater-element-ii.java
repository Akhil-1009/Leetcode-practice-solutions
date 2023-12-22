 class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        //Loop through all the numbers in nums from the end back to the start. 
        for(int i = nums.length - 1;i>=0;i--) {
            //For each number wipe any numbers less than it off the stack.
            while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            stack.push(nums[i]);
        }

        for(int i = nums.length - 1;i>=0;i--) {
            //For each number wipe any numbers less than it off the stack.
            while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            //Find the last remaining element if there is one. This is the next greater element.
            int result = -1;
            if(!stack.isEmpty()) {
                result = stack.peek();
            }

            //store the result. 
            stack.push(nums[i]);
            nums[i] = result;
        }

        return nums;
    }
}