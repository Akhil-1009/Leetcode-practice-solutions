class Solution {
public:
    void helper(vector<int>&nums,int i,int k,int no,vector<vector<int>>& output){
        int j=nums.size()-1;
        while(i<j)
        {
            if(nums[i]+nums[j]<k)
            {
                i++;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
            else{
                vector<int> ans;
                ans.push_back(no);
                ans.push_back(nums[i]);
                ans.push_back(nums[j]);
                output.push_back(ans);
                 while(i<j&&nums[i]==nums[i+1])
                 {
                     i++;
                 }
                while(j>i&&nums[j]==nums[j-1])
                {
                    j--;
                }
                i++;
                j--;
            }
        }
        
    }
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> output;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++)
        {
             if(i==0){
              helper(nums,i+1,0-nums[i],nums[i],output);
             }
            else{
                if(nums[i]!=nums[i-1])
                {
                    helper(nums,i+1,0-nums[i],nums[i],output);
                }
            }
        }
        return output;
    }
};