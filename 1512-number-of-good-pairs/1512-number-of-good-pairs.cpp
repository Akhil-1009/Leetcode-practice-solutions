class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
     unordered_map<int,int> ourmap;
        int count=0;
        for(int i=0;i<nums.size();i++)
        {
            if(ourmap.find(nums[i])!=ourmap.end())
            {
                count+=ourmap[nums[i]];
            }
            ourmap[nums[i]]++;
        }
        return count;
    }
};