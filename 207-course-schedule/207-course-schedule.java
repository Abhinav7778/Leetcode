class Solution {
    
    /* *************************cycle check in directed graph using dfs*********/
//     public boolean canFinish(int numCourses, int[][] prerequisites) {
        
//         int[] vis = new int[numCourses];
//         int[] dfsVis = new int[numCourses];
        
//         List<List<Integer>> adj = new ArrayList<>();
        
//         for(int i = 0; i < numCourses; ++i)
//         {
//             adj.add(new ArrayList<>());
//         }
        
//         for(int[] i : prerequisites)
//         {
//             adj.get(i[0]).add(i[1]);
//         }
        
//         for(int i = 0; i < numCourses; ++i)
//         {
//             if(vis[i] == 0)
//             {
//                 if(isCycleDFS(i, vis, dfsVis, adj))
//                 {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public boolean isCycleDFS(int node, int[] vis, int[] dfsVis, List<List<Integer>> adj)
//     {
//         vis[node] = 1;
//         dfsVis[node] = 1;
        
//         for(int i : adj.get(node))
//         {
//             if(vis[i] == 0)// if node not visited in any rec. we go into it
//             {
//                 if(isCycleDFS(i, vis, dfsVis, adj))
//                 {
//                     return true;//cycle foud in any prev recursion
//                 }//else just let the rec run completely
//             }
//             else if(dfsVis[i] == 1) 
//             {
//                 return true;//cycle found in current dfs rec
//             }
//         }
//         dfsVis[node] = 0;
//         return false;
//     }
    
    
    /* **************CYCLE CHECK IN DIR GRAPH USING BFS(TOPO SORT) ************** */
    
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int[] indeg = new int[numCourses];
        
        //here we do not need the topo array as topo sort is not asked we are just checking if cyclic or not.
        
        //Building adj list
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; ++i)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int[] i : prerequisites)
        {
            adj.get(i[0]).add(i[1]);
        }
        
        //filling indegree
        
        for(int i = 0; i < numCourses; ++i)
        {
            for(int j : adj.get(i))
            {
                indeg[j]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        
        //all elems with indegree = 0 added to queue
        for(int i = 0; i < numCourses; ++i)
        {
            if(indeg[i] == 0)
                q.add(i);
        }
        
        int count = 0;
        
        while(!q.isEmpty())
        {
            int node = q.remove();
            
            ++count;
            
            for(int i : adj.get(node))
            {
                --indeg[i];
                
                if(indeg[i] == 0)
                {
                    q.add(i);
                }
            }
        }
        
        
        return count == numCourses;
    }
    
}