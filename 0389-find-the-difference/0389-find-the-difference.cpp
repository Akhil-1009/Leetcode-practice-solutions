class Solution {
public:
    char findTheDifference(string s, string t) {
        int sum1=0;
        int sum2=0;
        int i=0;
        while(t[i]!='\0')
        {
            sum1+=s[i];
            sum2+=t[i];
            i++;
        }
        char ch=(char) (sum2-sum1);
        return ch;
            
    }
};