class Solution {
    public int pivotInteger(int n) {
        int sum=(n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            int sum1=(i*(i+1))/2;
            int newsum=(sum-sum1)+i;
            if(sum1==newsum)
            {
                return i;
            }
        }
        return -1;
    }
}