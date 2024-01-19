class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        int dp[][]=new int[row][col];
        for(int i=0;i<col;i++)
        {
            dp[row-1][i]=matrix[row-1][i];
        }
        for(int i=row-2;i>=0;i--)
        {
            for(int j=0;j<col;j++)
            {
                int left=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;
                int centre=dp[i+1][j];
                if(j!=0)
                {
                    left=dp[i+1][j-1];
                }
                if(j!=col-1)
                {
                    right=dp[i+1][j+1];
                }
                dp[i][j]=matrix[i][j]+Math.min(left,Math.min(right,centre));
                
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<col;i++)
        {
            ans=Math.min(ans,dp[0][i]);
        }
        return ans;
    }
}