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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.right==null&&root.left==null)
            return 0;
        return helper(root);
    }
    public int helper(TreeNode root)
    {
        TreeNode temp=root;
        if(root.right==null&&root.left==null)
        {
            return root.val;
        }
        int sum=0;
        while(temp!=null)
        {
            if(temp.left!=null)
            {
                sum+=helper(temp.left);
            }
            temp=temp.right;
        }
         return sum;
    }
}