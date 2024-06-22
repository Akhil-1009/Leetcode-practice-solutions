class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,j=0;
        int count1=0;
        int count=0;
        int totalcount=0;
        while(j<nums.length)
        {
            if(nums[j]%2!=0)
                count1++;
            else{
                totalcount+=count;
            }
            if(count1==k)
            {   count=0;
                while(count1==k)
                {
                    if(nums[i]%2==0)
                    {
                        count++;
                        i++;
                    }
                    else{
                        count++;
                        i++;
                        count1--;
                    }
                }
             totalcount+=count;
            }
            j++;
        }
        return totalcount;
    }
}