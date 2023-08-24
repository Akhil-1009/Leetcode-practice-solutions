class Solution {
public:
    int maxProfit(vector<int>& prices) {
        // if(prices.size()==1)
        // {
        //     return 0;
        // }
        // int maxprofit=0;
        // int prevprofit=0;
        // int currprofit;
        // for(int i=prices.size()-2;i>=0;i--)
        // {
        //     currprofit=prevprofit+prices[i+1]-prices[i];
        //     if(currprofit>maxprofit)
        //     {
        //         maxprofit=currprofit;
        //     }
        //     if(currprofit<0)
        //     {
        //         prevprofit=0;
        //     }
        //     else{
        //         prevprofit=currprofit;
        //     }
        // }
        // return maxprofit;
        int size=prices.size();
        int prevmax=prices[size-1];
        int maxprofit=0;
        int currentprofit;
        for(int i=prices.size()-2;i>=0;i--)
        {
            currentprofit=prevmax-prices[i];
            if(currentprofit>maxprofit)
                maxprofit=currentprofit;
            if(prices[i]>prevmax)
            {
                prevmax=prices[i];
            }
        }
        return maxprofit;
    }
};