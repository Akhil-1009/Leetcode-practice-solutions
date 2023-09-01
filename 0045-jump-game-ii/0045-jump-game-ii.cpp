class Solution {
public:
    int jump(vector<int>& nums) {
        int n=nums.size();
        int *dp=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]==0)
            {
                dp[i]=INT_MAX;
            }
            else if((nums[i]+i)>=n-1)
            {
                dp[i]=1;
            }
            else{
                int j=i+1;
                int min=INT_MAX;
                while(j<=i+nums[i])
                {
                    if(dp[j]<min){
                        min=dp[j];
                    }
                    j++;
                }
                if(min==INT_MAX)
                {
                    dp[i]=INT_MAX;
                }
                else{
                     dp[i]=min+1;
                }
               
            }
        }
        return dp[0];
    }
};