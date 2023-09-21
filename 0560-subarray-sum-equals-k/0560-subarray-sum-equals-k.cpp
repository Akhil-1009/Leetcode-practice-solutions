class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> ourmap;
        int count=0;
        int prefix=0;
        ourmap[prefix]++;
        for(int i=0;i<nums.size();i++)
        {
            prefix+=nums[i];
            if(ourmap.find(prefix-k)!=ourmap.end())
            {
                count+=ourmap[prefix-k];
            }
            ourmap[prefix]++;
        }
        return count;
    }
};