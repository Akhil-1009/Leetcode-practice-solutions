class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int i=0,j=1;
        PriorityQueue<Integer> minpq=new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxpq=new PriorityQueue<Integer>(Collections.reverseOrder());
        maxpq.add(nums[0]);
        minpq.add(nums[0]);
        int maxlength=1;
        int len=1;
        while(j<nums.length)
        {
            maxpq.add(nums[j]);
            minpq.add(nums[j]);
            if(maxpq.peek()-minpq.peek()<=limit)
            {
                len++;
            }
            else{
                if(len>maxlength)
                    maxlength=len;
                 len++;
                    while(maxpq.peek()-minpq.peek()>limit)
                    {
                        maxpq.remove(nums[i]);
                        minpq.remove(nums[i]);
                        i++;
                        len--;
                    }
            }
            j++;
        }
        if(len>maxlength) maxlength=len;
        return maxlength;
        
    }
}