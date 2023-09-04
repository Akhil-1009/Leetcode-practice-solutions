class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> output;
        vector<int> temp;
        temp.push_back(1);
        output.push_back(temp);
        for(int i=2;i<=numRows;i++)
        {
            int first=0;
            vector<int> temp;
            int n=output.size();
            for(int j=0;j<output[n-1].size();j++)
            {
                int second=output[n-1][j];
                temp.push_back(first+second);
                first=second;
            }
            temp.push_back(1);
            output.push_back(temp);
        }
        return output;
    }
};