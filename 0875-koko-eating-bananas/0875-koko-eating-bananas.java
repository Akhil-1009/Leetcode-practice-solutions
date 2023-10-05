class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low=1,high=piles[0];
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>high)
            {
                high=piles[i];
            }
        }
        int minSpeed=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0;i<piles.length;i++)
            {
                count+=Math.ceil((double)piles[i]/(double) mid);
                //  int rem=piles[i]%mid;
                // if(rem!=0)
                //     count++;
            }
            if(count<=h)
            {
                high=mid-1;
                 minSpeed=mid;
            }
            else{
                low=mid+1;
            }
            
        }
        return minSpeed;
        
    }
}