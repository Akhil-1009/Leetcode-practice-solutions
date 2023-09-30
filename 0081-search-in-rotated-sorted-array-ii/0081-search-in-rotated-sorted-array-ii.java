class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid;
        while(low<=high)
        {   mid=(low+high)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            if(nums[low]==nums[mid]&&nums[mid]==nums[high])
            {
                high=high-1;
                low=low+1;
                continue;
            }
            else if(nums[mid]>=nums[low])
            {
                if(target<=nums[mid]&&target>=nums[low])
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
         else{
             if(target>=nums[mid]&&target<=nums[high])
             {
                 low=mid+1;
             }
             else{
                 high=mid-1;
             }
         }
        }
        return false;
    }
}