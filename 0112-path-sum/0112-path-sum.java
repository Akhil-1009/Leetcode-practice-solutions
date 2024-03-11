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
    public boolean helper(TreeNode root,int targetsum,int currentsum)
    {   currentsum+=root.val;
        if(root.right==null && root.left==null)
        {
            if(currentsum==targetsum)
            {
                return true;
            }
            else{
                currentsum-=root.val;
                return false;
            }
        }
     if(root.left!=null)
     {
        boolean left=helper(root.left,targetsum,currentsum);
        if(left)
        {
            return true;
        }
     }
      if(root.right!=null) { boolean right=helper(root.right,targetsum,currentsum);
      if(right)
      {
          return true;
      }}
     currentsum-=root.val;
     return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return helper(root,targetSum,0);
    }
}