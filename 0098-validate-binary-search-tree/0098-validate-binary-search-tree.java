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
    class pair{
        boolean isbst;
        long max;
        long min;
    }
    public pair helper(TreeNode root)
    {
        if(root==null)
        {
            pair ans=new pair();
            ans.isbst=true;
            ans.max=Long.MIN_VALUE;
            ans.min=Long.MAX_VALUE;
            return ans;
        }
        pair leftans=helper(root.left);
        pair rightans=helper(root.right);
        pair finalans=new pair();
        finalans.isbst=(leftans.isbst && rightans.isbst)&&(root.val>leftans.max && root.val<rightans.min);
        finalans.max=Math.max(root.val,Math.max(rightans.max,leftans.max));
        finalans.min=Math.min(root.val,Math.min(rightans.min,leftans.min));
        return finalans;
        
        }
    public boolean isValidBST(TreeNode root) {
        pair ans=helper(root);
        return ans.isbst;
    }
}