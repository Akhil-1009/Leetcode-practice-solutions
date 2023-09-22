class Solution {
public:
    bool isSubsequence(string s, string t) {
        int dp[s.length()+1][t.length()+1];
        int n1=s.length();
        int n2=t.length();
        for(int i=0;i<=t.length();i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=s.length();i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s[n1-i]==t[n2-j])
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        if(dp[n1][n2]==n1)
        {
            return true;
        }
        else{
            return false;
        }
    }
};