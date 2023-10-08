class Solution {
    int[][] memo ;
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        memo = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                memo[i][j] = Integer.MIN_VALUE;
            }
        }
        
        return helper(nums1, nums2, 0, 0);
    }
    
    public int helper(int[] nums1, int[] nums2, int i, int j) {
        if (i >= nums1.length || j >= nums2.length ) {
            return Integer.MIN_VALUE;
        }
        if(memo[i][j] != Integer.MIN_VALUE) return memo[i][j];
        
        int take = nums1[i] * nums2[j] + Math.max(helper(nums1, nums2, i + 1, j + 1) , 0);
        int skip1 = helper(nums1, nums2, i + 1, j);
        int skip2 = helper(nums1, nums2, i, j + 1);
        
        return memo[i][j] = Math.max(Math.max(skip2, skip1), take);
    }
}