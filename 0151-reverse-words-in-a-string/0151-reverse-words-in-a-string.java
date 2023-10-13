class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        int i=s.length()-1;
        int end=i;
        while(i>=0)
        {
            while(i>=0&&s.charAt(i)!=' ')
             { //  ans=s.charAt(i)+ans;
                i--;
            }
            for(int j=i+1;j<=end;j++)
            {
                ans+=s.charAt(j);
            }
            
            if(i!=-1)ans+=' ';
            while(i>=0 && s.charAt(i)==' ') i--;
            end=i;
        }
        // ans.trim();
        // for(int j=i-1;j<=end;j++)
        //     {
        //         ans+=s.charAt(j);
        //     }
        return ans;
    }
}