class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        String ans="";
        for(;i>=0;i--)
        {
            int no=num.charAt(i)-48;
            if(no%2!=0)
            {
                ans+=num.substring(0,i+1);
                break;
            }
        }
        return ans;
    }
}