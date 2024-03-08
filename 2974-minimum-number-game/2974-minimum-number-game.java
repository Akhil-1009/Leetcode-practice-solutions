class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1;
        while(i<nums.length&&j<nums.length)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i+=2;
            j+=2;
        }
        return nums;
    }
}