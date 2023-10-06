class Solution {
    public int integerBreak(int n) {
        int []arr=new int[n+1];
        if(n<=2) return 1;
        if(n==3) return 2;
            arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        for(int i=4;i<=n;i++)
        {   int maxproduct=1;
            for(int j=1;j<i;j++)
            {
                maxproduct=Math.max(maxproduct,j*arr[i-j]);
            }
            arr[i]=maxproduct;
        }
        return arr[n];
    }
}