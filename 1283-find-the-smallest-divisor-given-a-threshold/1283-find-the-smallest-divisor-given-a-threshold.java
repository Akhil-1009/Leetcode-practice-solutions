class Solution {
    public boolean ispossible(int []nums,int div,int threshold)
    {
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count+=Math.ceil(nums[i]/(double) div);
        }
        return count<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(nums[i]>high)
                high=nums[i];
        }
        // if(threshold>=sum)
        // {
        //     return 1;
        // }
        int ans=3;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(ispossible(nums,mid,threshold)){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}