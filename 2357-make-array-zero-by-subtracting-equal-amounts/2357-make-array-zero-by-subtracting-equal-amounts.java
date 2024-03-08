 class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> a=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                continue;
            a.add(nums[i]);
        }
        return a.size();
    }
}