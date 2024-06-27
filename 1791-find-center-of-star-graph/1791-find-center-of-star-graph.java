class Solution {
    public int findCenter(int[][] edges) {
        int first=edges[0][0];
        int second=edges[0][1];
        if(first==edges[1][0])
        {
            return first;
        }
        else if(first==edges[1][1])
        {
            return first;
        }
        else{
            return second;
        }
    }
}