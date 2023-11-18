 class Solution {
    public int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);
        int ans = 1;
        for(int i=nums.length-1;i>0;){
            int n = 1;
            int sum = nums[i];
            int j = i-1;
            while (j>=0 && nums[i]==nums[j]){
                j--;
                n++;
                sum+=nums[i];
            }
            int t = j;
            for(;j>=0;j--){
                sum+=nums[j];
                if(sum+k<nums[i]*(n+1)){
                    break;
                }
                n++;
            }
           ans = Math.max(ans,n);
            i=t;
        }
        return ans;
    }
}