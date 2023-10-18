 class Solution
{
    ArrayList<ArrayList<Integer>> graph;
    int[] vis;
    int[] head;
    
    public int minimumTime(int n, int[][] relations, int[] time)
    {
        graph = new ArrayList<>();
        vis = new int[n+1];
        head = new int[n+1];
        
        int ans=0;
        
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int[] i:relations)
        {
            graph.get(i[1]).add(i[0]);
            head[i[0]]=1;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(vis[i]==0)
            {
                int cur=dfs(i,0,time);
                if(head[i]==0)ans=Math.max(ans,cur);
            }
        }
        
        return ans;
    }
    
    public int dfs(int i,int val,int[] time)
    {
        if(vis[i]!=0)return vis[i];
        
        int cur = 0;
        
        for(int j:graph.get(i))
        {
            cur=Math.max(cur,dfs(j,val,time));
        }
        val+=time[i-1];
        vis[i]=cur+val;
        
        return vis[i];
    }
    
}