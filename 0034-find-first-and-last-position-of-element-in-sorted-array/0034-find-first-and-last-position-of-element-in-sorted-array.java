class Solution {
    public int[] searchRange(int[] nums, int target) {
        int right=-1,left=-1,low=0,high=nums.length-1,mid;
        int arr[]=new int[2];
        // search for first occurance
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                right=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        //search for last last occurance
        low=0;
        high=nums.length-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                left=mid;
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(right!=-1)
        {
            arr[0]=right;
            arr[1]=left;
        }
        else{
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}