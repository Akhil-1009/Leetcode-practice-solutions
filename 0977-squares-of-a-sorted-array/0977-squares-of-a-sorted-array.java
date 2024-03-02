class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]= new int[nums.length];
        int last=nums.length-1;
        int first=0;
        int i=nums.length-1;
        while(first<=last)
        {
            int sq1=nums[first]*nums[first];
            int sq2=nums[last]*nums[last];
            if(sq1<sq2)
            {
                arr[i]=sq2;
                i--;
                last--;
            }
            else{
                arr[i]=sq1;
                first++;
                i--;
            }
        }
        return arr;
    }
}