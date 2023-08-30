class Solution {
public:
    int minDifference(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        if(n<=3){return 0;}
        int minele=INT_MAX;
        for(int i=1;i<=4;i++)
        {
            minele=min(minele,nums[n-i]-nums[4-i]);
        }
        return minele;
    }
};