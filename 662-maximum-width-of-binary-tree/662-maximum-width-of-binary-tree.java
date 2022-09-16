/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Node
    {
        int level;
        TreeNode node;
        
        Node(int level, TreeNode node)
        {
            this.level = level;
            this.node = node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(new Node(0, root));
        
        int max = Integer.MIN_VALUE;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            int start = 0, end = 0;
            
            int minOfCurrLevel = q.peek().level;
            
            for(int i = 0; i < size; ++i)
            {
                Node temp = q.remove();
                
                int tempLevel = temp.level;
                
                int normalizedLevel = tempLevel - minOfCurrLevel;
                
                if(i == 0)start = normalizedLevel;
                
                if(i == size - 1)end = normalizedLevel;
                
                if(temp.node.left != null)
                {
                    q.add(new Node(2 * normalizedLevel + 1, temp.node.left));
                }
                if(temp.node.right != null)
                {
                    q.add(new Node(2 * normalizedLevel + 2, temp.node.right));
                }
            }
            max = Math.max(max, end - start + 1);
            
        }
        return max;
    }
}