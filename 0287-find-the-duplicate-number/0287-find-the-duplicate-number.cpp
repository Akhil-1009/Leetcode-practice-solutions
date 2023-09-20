class Solution {
public:
    int findDuplicate(vector<int>& nums) {
         int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[nums[slow]];
            fast=nums[nums[nums[fast]]];
        }while(slow!=fast);
        fast=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
};