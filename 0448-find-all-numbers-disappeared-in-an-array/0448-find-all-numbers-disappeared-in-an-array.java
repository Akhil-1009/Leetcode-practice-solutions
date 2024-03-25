class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
             int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
            {
                continue;
            }
            nums[index]*=-1;
                
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans.add(i+1);
            }
                
        }
        return ans;
        
    }
}