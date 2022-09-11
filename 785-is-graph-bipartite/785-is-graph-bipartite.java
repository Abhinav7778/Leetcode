class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; ++i)
        {
            adj.add(new ArrayList<>());
        }
        int j = 0;
        for(int[] i : graph)
        {
            for(int k = 0; k < i.length; ++k)
            {
                adj.get(j).add(i[k]);
            }
            ++j;
        }
        
        int[] color = new int[n];
        
        Arrays.fill(color, -1);
        
        for(int i = 0; i < n; ++i)
        {
            if(color[i] == -1)
            {
                if(!dfs(i, adj, color))
                    return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int node, List<List<Integer>> adj, int[] color)
    {
        for(int i : adj.get(node))
        {
            if(color[i] == -1)
            {
                color[i] = 1 - color[node];//toggle 1 0 1 0 1 0....
            
                if(!dfs(i, adj, color))
                    return false;
            }    
            else if(color[i] == color[node])
                return false;
        }
        return true;
    }
}