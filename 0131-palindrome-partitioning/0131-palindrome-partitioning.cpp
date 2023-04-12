class Solution {
public:
    void solve(int index,string& s,vector<vector<string>>& ans,vector<string>& a,int **pal)
    {   int n=s.length();
        if(index>=n)
        {
            ans.push_back(a);
            return;
        }
        for(int i=index;i<n;i++)
        {
             if(pal[index][i]==1)
             {
                 a.push_back(s.substr(index,(i-index)+1));
                 solve(i+1,s,ans,a,pal);
                 a.pop_back();
             }
        }
    }
    vector<vector<string>> partition(string s) {
     
     int n=s.length();
     int **pal=new int *[16];
     for(int i=0;i<n;i++)
     {    pal[i]=new int[16];
         for(int j=0;j<n;j++)
         {
             pal[i][j]=0;
         }
     }
     for(int g=0;g<n;g++)
     {
          for(int i=0,j=g;j<n;i++,j++)
          {
              if(g==0)
              {
                pal[i][j]=1;
              }
              else if(g==1)
              {
                  if(s[i]==s[j])
                  {
                      pal[i][j]=1;
                  }
              }
              else{
                  if(s[i]==s[j]&&pal[i+1][j-1]==1)
                  {
                      pal[i][j]=1;
                  }

              }
          }
     }
     vector<vector<string>> ans;
     vector<string> a;
     solve(0,s,ans,a,pal);   
     return ans;
    }
};