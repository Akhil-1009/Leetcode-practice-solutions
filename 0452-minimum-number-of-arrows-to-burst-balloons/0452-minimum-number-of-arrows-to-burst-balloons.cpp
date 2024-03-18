class Solution {
public:
    static bool comp(vector<int>& a,vector<int>& b)
    {
        return a[1]<b[1];
    }
    int findMinArrowShots(vector<vector<int>>& points) {
        sort(points.begin(),points.end(),comp);
        int n=points.size();
        int count=1;
        int last=points[0][1];
        for(int i=1;i<n;i++)
        {
            if(points[i][0]<=last)
            {
                continue;

            }
            else{
                last=points[i][1];
                count++;
            }
        }
        return count;
    }
};