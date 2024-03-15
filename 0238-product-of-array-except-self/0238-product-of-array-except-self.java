class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] =new int[nums.length];
        int n=nums.length;
        arr[0]=1;
        for(int i=1;i<nums.length;i++)
        {
             arr[i]=arr[i-1]*nums[i-1];   
        }
        int arr_product=1;
        for(int i=n-1;i>=0;i--)
        {
            arr[i]=arr_product*arr[i];
            arr_product*=nums[i];
        }
        return arr;
        
        
    }
}