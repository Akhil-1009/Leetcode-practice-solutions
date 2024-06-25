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
    public int helper(TreeNode root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        int rightsum=helper(root.right,sum);
        int temp=root.val;
        root.val+=rightsum+sum;
        int leftsum=helper(root.left,root.val);
        return temp+rightsum+leftsum;
        
    }
    public TreeNode bstToGst(TreeNode root) {
        helper(root,0);
        return root;
    }
}