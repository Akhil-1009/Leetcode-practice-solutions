class Solution {
    public int findKthPositive(int[] arr, int k) {
        // if(arr.length==1) return arr[0]-1
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]-(mid+1)<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }
}