class Solution {
    public int maxFrequencyElements(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int freq=map.get(nums[0]);
        int maxfreq=map.get(nums[0]);
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            if(map.get(nums[i])>maxfreq)
            {
                maxfreq=map.get(nums[i]);
                freq=maxfreq;
            }
            else if(map.get(nums[i])==maxfreq)
            {
                freq+=maxfreq;
            }
            map.put(nums[i],0);
        }
        return freq;
    }
}