class Solution {
    public boolean helper(int []nums,int flag,int i)
    {
        if(flag==1)
        {
            while(i<nums.length-1)
            {
                if(nums[i]>nums[i+1])
                {
                    return false;
                }
                i++;
                }
            return true;
        }
        else{
            while(i<nums.length-1)
            {
                if(nums[i]<nums[i+1])
                {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=2)
        {
            return true;
        }
        int flag=0;
        int i=0;
        while(i<nums.length-1&&nums[i]==nums[i+1])
        {
            i++;
        }
        if(i<nums.length-1&&nums[i]<nums[i+1])
        {
            flag=1;
        }
        return helper(nums,flag,i+1);
    }
}