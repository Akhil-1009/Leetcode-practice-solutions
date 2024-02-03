class Solution {
public:
    int solve(int index,vector<int>& arr,int k)
    {    int n=arr.size();
        // if(index==arr.size()) return 0;
        int *dp=new int[n+1];
         dp[n]=0;
    for(int index=n-1;index>=0;index--){
        int len=0,maxtemp=INT_MIN,maxsum=INT_MIN;
        for(int j=index;j<n&&j<index+k;j++)
        {   len++;
            if(arr[j]>maxtemp)
            {
                maxtemp=arr[j];
            }
            int sum= dp[j+1]+len*maxtemp;
            maxsum=max(sum,maxsum);
            }
            dp[index]=maxsum;
        }
        return dp[0];
    }
    int maxSumAfterPartitioning(vector<int>& arr, int k) {
        return solve(0,arr,k);
    }
};