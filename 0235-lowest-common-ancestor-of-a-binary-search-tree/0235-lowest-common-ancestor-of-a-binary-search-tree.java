/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x=Math.max(p.val,q.val);
        int y=Math.min(p.val,q.val);
        if(root==null)
            return null;
        
        if(root.val==x||root.val==y)
        {
            return root;
        }
        
        
        if(root.val>x)
        {
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(root.val<y)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        else{
            return root;
        }
    }
}