class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count=0;
        int currEle;
        for(int i=0;i<nums.size();i++)
        {
            if(count==0)
            {
                currEle=nums[i];
                count++;
                continue;
            }
            if(nums[i]==currEle)
            {
                count++;
            }
            else{
                count--;
            }
        }
        return currEle;
    }
};