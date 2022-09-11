class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int[] vis = new int[numCourses];
        int[] dfsVis = new int[numCourses];
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < numCourses; ++i)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int[] i : prerequisites)
        {
            adj.get(i[0]).add(i[1]);
        }
        
        for(int i = 0; i < numCourses; ++i)
        {
            if(vis[i] == 0)
            {
                if(isCycleDFS(i, vis, dfsVis, adj))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isCycleDFS(int node, int[] vis, int[] dfsVis, List<List<Integer>> adj)
    {
        vis[node] = 1;
        dfsVis[node] = 1;
        
        for(int i : adj.get(node))
        {
            if(vis[i] == 0)
            {
                if(isCycleDFS(i, vis, dfsVis, adj))
                {
                    return true;//cycle foud in any prev recursion
                }//else just let the rec run completely
            }
            else if(dfsVis[i] == 1)
            {
                return true;//cycle found in current dfs rec
            }
        }
        dfsVis[node] = 0;
        return false;
    }
}