class Solution {
    public String maximumOddBinaryNumber(String s) {
        int total=s.length();
        int count=0;
        for(int i=0;i<total;i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<count;i++)
        {
            sb.append("1");
        }
        for(int i=1;i<=total-count;i++)
        {
            sb.append("0");
        }
        sb.append("1");
        String ans=sb.toString();
        return ans;
    }
}