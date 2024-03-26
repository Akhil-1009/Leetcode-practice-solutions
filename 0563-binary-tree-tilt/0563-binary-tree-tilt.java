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
        int tilt;
        int sum;
    }
    public pair helper(TreeNode root)
    {
        if(root==null)
        {
            pair ans=new pair();
            ans.tilt=0;
            ans.sum=0;
            return ans;
        }
        pair leftans=helper(root.left);
        pair rightans=helper(root.right);
       int curtilt=Math.abs(leftans.sum-rightans.sum);
        pair ans=new pair();
        ans.tilt=curtilt+leftans.tilt+rightans.tilt;
        ans.sum=leftans.sum+rightans.sum+root.val;
        return ans;
    }
    public int findTilt(TreeNode root) {
        pair ans=helper(root);
        return ans.tilt;
    }
}