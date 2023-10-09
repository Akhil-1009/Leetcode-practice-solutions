class Solution {
    public int helper(int []nums,int k)
    {
          int count=1;
          int subsum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(subsum+nums[i]<=k)
            {
                subsum+=nums[i];
            }
            else{
                count+=1;
                subsum=nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
       int low=nums[0],high=0;
        for(int i=0;i<nums.length;i++)
        {
            high+=nums[i];
            if(nums[i]>low)
            {
                low=nums[i];
            }
        }
        while(low<=high)
        {
            int mid=(high+low)/2;
            int count=helper(nums,mid);
            if(count>k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}