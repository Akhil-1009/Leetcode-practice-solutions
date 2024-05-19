 class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        // Build the adjacency list for the tree
        int n = nums.length;
        
        // Initialize memoization array
        long[][] memo = new long[n][2];
        for (long[] row : memo) {
            Arrays.fill(row, -1);
        }
        
        // Call the helper function to calculate the max sum starting from node 0
        return dfs(0, 1, nums, k, memo);
    }

    private long dfs(int node, int isEven, int[] nums, int k, long[][] memo) {
        if (node == nums.length) {
            return isEven == 1 ? 0 : Integer.MIN_VALUE;
        }

        if (memo[node][isEven] != -1) {
            return memo[node][isEven];
        }

        long noXorDone = nums[node] + dfs (node + 1, isEven, nums, k, memo);

        long xorDone = (nums[node] ^ k) + dfs (node + 1, isEven ^ 1, nums, k, memo);  
        
        
        return memo[node][isEven] = Math.max(xorDone, noXorDone);
    }
}