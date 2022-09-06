class Solution 
{
    public void flatten(TreeNode root)
    {//preorder iterative(Root Left Right)
        if(root == null)//base case for null graph 
            return;
        
        ArrayDeque<TreeNode> stack= new ArrayDeque<>();//Faster than Stack 
        
        stack.addLast(root);//adding the root node 
        while(!stack.isEmpty())//terminating condition 
        {
            TreeNode temp= stack.removeLast();//popping the top of the stack, the inorder root//Root
            
            if(temp.right != null)
                stack.addLast(temp.right);//we are pushing the right first to access the the left fast //Right
            if(temp.left != null)
                stack.addLast(temp.left);//we are pushing the left at last to access it faster as it is the next preorder element //Left
            
            if(!stack.isEmpty())
               temp.right= stack.peekLast();//only item left on the top of the stack is the next inorder root, so creating a dependency linking each other 
            temp.left= null;//destroying the left link and pointing to the null
        }
        return;//returning to the main  method 
    }
}//please do Upvote, it helps a lot