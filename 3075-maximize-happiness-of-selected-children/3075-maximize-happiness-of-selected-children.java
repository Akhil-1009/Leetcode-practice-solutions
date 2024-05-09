class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        
        for(int i=0,j=happiness.length-1;i<k;i++,j--)
        {
            ans+=Math.max(0,happiness[j]-i);
        }
        return ans;
    }
}