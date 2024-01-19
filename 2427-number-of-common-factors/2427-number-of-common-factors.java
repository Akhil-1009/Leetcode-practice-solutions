class Solution {
    public int commonFactors(int a, int b) {
        int limit=Math.min(a,b);
        int no=0;
        for(int i=1;i<=limit;i++)
        {
            if(a%i==0&&b%i==0)
            {
                no++;
            }
        }
        return no;
    }
}