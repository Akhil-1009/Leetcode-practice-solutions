class Solution {
public:
    int maxCoins(vector<int>& piles) {
        sort(piles.begin(),piles.end());
        int n=piles.size();
        int f=0,e=n-1,se=n-2;
        int ans=0;
        while(f<e&&f<se)
        {
            ans+=piles[se];
            se-=2;
            e-=2;
            f++;
        }
        return ans;
    }
};