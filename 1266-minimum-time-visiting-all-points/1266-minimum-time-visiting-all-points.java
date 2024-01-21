 class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int prevX = points[i - 1][0];
            int prevY = points[i - 1][1];

            int currX = points[i][0];
            int currY = points[i][1];

            int dx = Math.abs(currX - prevX);
            int dy = Math.abs(currY - prevY);

            totalTime += Math.max(dx, dy);
        }

        return totalTime;
    }
}