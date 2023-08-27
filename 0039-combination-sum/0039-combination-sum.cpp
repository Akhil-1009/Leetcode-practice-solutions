class Solution {
public:
    void combination(vector<vector<int>>& ans,vector<int>& candidates,vector<int>& comb,int i,int target,int curr)
    {
        if(curr>target)
            return;
        if(curr==target)
        {  ans.push_back(comb);
             return;}
         for(int j=i;j<candidates.size();j++)
        {
            comb.push_back(candidates[j]);
            curr+=candidates[j];
            // target-=candidates[j];
            combination(ans,candidates,comb,j,target,curr);
            comb.pop_back();
        curr-=candidates[j];
            // target+=candidates[j];
        }
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> comb;
        combination(ans,candidates,comb,0,target,0);
        return ans;
    }
};