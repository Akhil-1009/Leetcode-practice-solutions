class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1)
            {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}