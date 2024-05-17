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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root.right==null&&root.left==null)
        {
            if(root.val==target)
            {
                return null;
            }
            else {
                return root;
            }
        }
        
        
        if(root.left!=null)
        {
            root.left=removeLeafNodes(root.left,target);
        }
        if(root.right!=null)
        {
            root.right=removeLeafNodes(root.right,target);
        }
        if(root.right==null&&root.left==null)
        {
            if(root.val==target)
            {
                return null;
            }
            else {
                return root;
            }
            
        }
    return root;
    }
}