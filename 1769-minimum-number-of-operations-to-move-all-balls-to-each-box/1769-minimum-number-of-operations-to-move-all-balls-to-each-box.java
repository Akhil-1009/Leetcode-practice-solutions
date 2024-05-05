class Solution {
    public int[] minOperations(String boxes) {
        int []ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {    int count=0;
            for(int j=0;j<boxes.length();j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(boxes.charAt(j)=='1')
                {
                    count+=Math.abs(i-j);
                }
            }
                ans[i]=count;
        }
        return ans;
    }
}