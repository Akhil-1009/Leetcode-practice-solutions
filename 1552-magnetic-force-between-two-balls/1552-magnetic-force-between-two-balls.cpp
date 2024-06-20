class Solution {
public:
    bool ispossible(vector<int>& position,int m,int mid)
    {
        int count=1;
        int prev=position[0];
        for(int i=1;i<position.size();i++)
        {
            if(position[i]-prev>=mid)
            {
                count++;
                prev=position[i];
            }
        }
        return count>=m;
    }
    int maxDistance(vector<int>& position, int m) {
        int n=position.size();
        sort(position.begin(),position.end());
        int low=INT_MAX;
        for(int i=1;i<n;i++)
        {
            if(position[i]-position[i-1]<low)
            {
                low=position[i]-position[i-1];
            }
        }
        int high=position[n-1]-position[0];
        int finalans;
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            bool ans=ispossible(position,m,mid);
            if(ans)
            {
                low=mid+1;
                finalans=mid;
            }
            else{
                high=mid-1;
            }
        }
        return finalans;
    }
};