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
    public boolean isBalanced(TreeNode root) {
        int no=helper(root);
        if(no==-1)
        {
            return false;
        }
        return true;
    }
    public int helper(TreeNode root)
    {
        if (root==null)
            return 0;
        int leftans=helper(root.left);
        if(leftans==-1)
            return -1;
        int rightans=helper(root.right);
        if(rightans==-1)
            return -1;
        if(Math.abs(leftans-rightans)<=1)
        {
            return 1+Math.max(rightans,leftans);
        }
        return -1;
    }
}