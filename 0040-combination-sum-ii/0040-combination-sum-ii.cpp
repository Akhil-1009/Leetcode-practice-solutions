class Solution {
public:
    int getUniq(int i,vector<int>& candidates)
    {
        if(i+1==candidates.size())
        {
            return i;
        }
        if(candidates[i]!=candidates[i+1])
        {
            return i;
        }
         return getUniq(i+1,candidates);
    }
    void combination(vector<vector<int>>& ans,vector<int>& comb,vector<int>& candidates,int target,int curr,int i){
        if(i==candidates.size()) {
            if(curr==target)
         { //sort(comb.begin(),comb.end());
            ans.push_back(comb);
            
        }
            return;
        }
        if(curr>target)
        {
            return;
        }
        if(curr==target)
         { //sort(comb.begin(),comb.end());
            ans.push_back(comb);
            return;
        }
        
        comb.push_back(candidates[i]);
        curr+=candidates[i];
        combination(ans,comb,candidates,target,curr,i+1);
        comb.pop_back();
        curr-=candidates[i];
        i=getUniq(i,candidates);
        combination(ans,comb,candidates,target,curr,i+1);
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> comb;
        sort(candidates.begin(),candidates.end());
        combination(ans,comb,candidates,target,0,0);
        return ans;
    }
};