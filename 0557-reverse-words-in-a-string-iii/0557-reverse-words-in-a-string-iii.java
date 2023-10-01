class Solution {
    public String reverse(String s,int i,int j)
    {   String ans="";
        while(j>=i)
        {
            ans+=s.charAt(j);
            j--;
        }
        return ans;
    }
    public String reverseWords(String s) {
        int i=0,j=0;
        int n=s.length();
        String ans="";
        while(j<n)
        {
            while(j<n && s.charAt(j)!=' ')
            {
                j++;
            }
            ans+=reverse(s,i,j-1);
            if(j<n)
            {
                ans+=" ";
            }
            j++;
            i=j;
        }
        return ans;
    }
}