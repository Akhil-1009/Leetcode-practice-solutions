class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
      vector<int> ans;
        int n=nums.size();
        int pos=0;
        int neg=0;
       while(pos<n||neg<n)
        {   while(pos<n&&nums[pos]<0)
        {
            pos++;
        }
         if(pos!=n) 
         { 
             ans.push_back(nums[pos]);
             pos++;
         }
            
            
                while(neg<n&&nums[neg]>0)
        {
            neg++;
        }
         if(neg!=n) 
         { 
             ans.push_back(nums[neg]);
             neg++;
         }
            
        }
        return ans;
    }
};
