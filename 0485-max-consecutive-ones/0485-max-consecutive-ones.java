class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int i=0;
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        while(i<n)
        {
            while(i<n&&nums[i]==1)
            {
                i++;
                count++;
            }
            if(count>maxcount)
            {
                maxcount=count;
            }
            count=0;
            i++;
        }
        return maxcount;
    }
}