class Solution {
    public int findCenter(int[][] edges) {
        // int first=edges[0][0];
        // int second=edges[0][1];
        if(edges[0][0]==edges[1][0])
        {
            return edges[0][0];
        }
        else if(edges[0][0]==edges[1][1])
        {
            return edges[0][0];
        }
        else{
            return edges[0][1];
        }
    }
}