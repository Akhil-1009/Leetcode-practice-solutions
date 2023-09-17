class Solution {
public:
    int maxProduct(vector<int>& nums) {
        long long temp=1, ans=INT_MIN;
int n=nums.size();

    for(int i=0;i<n;i++){
        temp=(temp%1000000007)*nums[i];
        if(temp>ans)ans=temp;
        if(nums[i]==0)temp=1;
    }
    
    temp=1;

    for(int i=n-1;i>=0;i--){
        temp=(temp%1000000007)*nums[i];
        if(temp>ans)ans=temp;
        if(nums[i]==0)temp=1;
    }
    return ans;
    }
};