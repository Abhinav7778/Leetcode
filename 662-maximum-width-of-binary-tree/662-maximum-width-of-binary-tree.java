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
            TreeNode node;
            int level;
            Node(TreeNode node, int level)
            {
                this.node = node;
                this.level = level;
            }
        }
    public int widthOfBinaryTree(TreeNode root) {
        
        int res = 0;
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(new Node(root, 0));
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            int start = 0, end = 0;
            
            
            int min = q.peek().level;
            
            for(int i = 0; i < size; ++i)
            {
                Node temp = q.remove();
                
                int index = temp.level - min;
                
                if( i == 0) start = index; 
                if(i == size - 1) end = index;
                
                if(temp.node.left != null)
                {
                    q.add(new Node(temp.node.left, 2*index + 1));
                }
                if(temp.node.right != null)
                {
                    q.add(new Node(temp.node.right, 2*index + 2));
                }
                
            }
            
            res = Math.max(res, end - start + 1);
        }
        
        return res;
        
    }
}