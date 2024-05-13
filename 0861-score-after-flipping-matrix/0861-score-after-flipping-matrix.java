class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==0)
            {
                for(int j=0;j<m;j++)
                {
                    grid[i][j] ^=1;
                }
            }
        }
        for(int j=1;j<m;j++)
        {
            int colcount=0;
            for(int i=0;i<n;i++)
            {
                colcount+=grid[i][j];
            }
            if(colcount<n-colcount)
            {
                for(int i=0;i<n;i++)
                {
                    grid[i][j]^=1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans+=grid[i][j]*Math.pow(2,m-j-1);
            }
        }
        return ans;
    }
}