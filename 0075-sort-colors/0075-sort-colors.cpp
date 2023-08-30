class Solution {
public:
    void sortColors(vector<int>& nums) {
        int zeropointer=0;
        int twopointer=nums.size()-1;
        int i=0;
        while(i<=twopointer)
        {
          if(nums[i]==0)
          {
              if(i==zeropointer)
              {
                  i++;
                  zeropointer++;
              }
              else{
                  int temp=nums[i];
                  nums[i]=nums[zeropointer];
                  nums[zeropointer]=temp;
                  zeropointer++;
              }
          }
           else if(nums[i]==2)
           {
              int temp=nums[i];
                  nums[i]=nums[twopointer];
                  nums[twopointer]=temp;
                  twopointer--;
           }
            else{
                i++;
            }
        }
    }
};