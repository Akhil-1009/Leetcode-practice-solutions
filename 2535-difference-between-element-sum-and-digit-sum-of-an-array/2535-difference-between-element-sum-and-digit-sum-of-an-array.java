class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int no=nums[i];
            while(no>0)
            {
                digitsum+=no%10;
                no=no/10;
            }
        }
        return Math.abs(sum-digitsum);
    }
}