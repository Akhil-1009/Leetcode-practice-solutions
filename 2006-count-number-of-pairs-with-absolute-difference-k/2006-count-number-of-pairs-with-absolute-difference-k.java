class Solution {
    public int countKDifference(int[] nums, int k) {
          int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i] + k))
            count += map.get(nums[i] + k);
        }
        return count;
    }
}