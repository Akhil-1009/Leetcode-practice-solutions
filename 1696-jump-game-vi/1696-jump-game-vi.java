class Solution {
    public int maxResult(int[] nums, int k) {
        int n=nums.length;
        int dp[]=new int[n];
        Deque<Integer> d=new LinkedList<Integer>();
        // d.offerFirst();
        for(int i=n-1;i>=0;i--)
        { if(i==n-1)
        {
            dp[i]=nums[i];
        }
         else{
            dp[i]=dp[d.peekFirst()]+nums[i];
         }
            while(d.size()>0&&dp[d.peekLast()]<=dp[i])
            {
                d.pollLast();
            }
            d.offerLast(i);
            if(d.peekFirst()>(i-1)+k)
            {
                d.pollFirst();
            }
        }
        return dp[0];
    }
}