class Solution {
    public int findMin(int[] nums) {
         int low=0,high=nums.length-1;
        int mid,min=Integer.MAX_VALUE;
        while(low<=high)
        {   mid=(low+high)/2;
             
             
            if(nums[mid]>=nums[low])
            {
                 if(nums[low]<min)
                 {
                     min=nums[low];
                 }
                low=mid+1;
            }
         else if(nums[mid]<=nums[high]){
              if(nums[mid]<min)
              {
                  min=nums[mid];
              }
             high=mid-1;
         }
         else{
             return nums[high];
         }
        }
        return min;
    }
}