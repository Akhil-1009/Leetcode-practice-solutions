class Solution {
public:
    string longestPalindrome(string s) {
        int n=s.length();
        int dp[n][n];
        int len=1;
        int start=0,end=0;
        for(int g=0;g<n;g++)
        {
            for(int i=0,j=g;j<n;i++,j++)
            {
                if(i==j)
                {
                    dp[i][j]=1;
                }
                else if(g==1){
                    if(s[i]==s[j])
                    {
                        dp[i][j]=1;
                        int temp=(j-i)+1;
                        if(temp>len)
                        {
                            len=temp;
                            start=i;
                            end=j;
                        }
                    }
                    else{
                        dp[i][j]=-1;
                    }
                }
                else if(s[i]==s[j])
                {
                    if(dp[i+1][j-1]==1)
                    {
                        dp[i][j]=1;
                        int temp=(j-i)+1;
                        if(temp>len)
                        {
                            len=temp;
                            start=i;
                            end=j;
                        }
                    }
                    else{
                        dp[i][j]=-1;
                    }
                }
                else{
                    dp[i][j]=-1;
                }
            }
        }
        // cout<<start<<" "<<end<<" "<<len;
        return s.substr(start,len);
    }
};