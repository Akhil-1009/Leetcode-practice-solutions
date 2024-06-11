class Solution {
    public int heightChecker(int[] heights) {
        int[] hCopy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(hCopy);

        int ans = 0;
        for (int i = 0; i < hCopy.length; i++) {
            if (hCopy[i] != heights[i]) {
                ans++;
            }
        }

        return ans;
    }
}