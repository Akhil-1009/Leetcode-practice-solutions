class Solution {
    public boolean isPossible(int []arr,int m,int k,int mid)
    {
        int adj=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(mid>=arr[i])
            {
                adj++;
            }
            else{
                count+=adj/k;
                adj=0;
            }
        }
        count+=adj/k;
        return count>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)
            return -1;
        int low=1,high=bloomDay[0];
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]>high)
            {
                high=bloomDay[i];
            }
        }
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,m,k,mid))
            {
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}