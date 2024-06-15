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
class ReturnDiam{
    int diameter;
    int height;
}

class Solution {
    public ReturnDiam dia(TreeNode root)
    {
        if(root==null)
        {
            ReturnDiam d=new ReturnDiam();
            d.diameter=0;
            d.height=0;
            return d;
        }
        ReturnDiam leftans=dia(root.left);
        ReturnDiam rightans=dia(root.right);
        ReturnDiam ans=new ReturnDiam();
        ans.diameter=Math.max(leftans.diameter,Math.max(rightans.diameter,leftans.height
                                                       +rightans.height));
        ans.height=1+Math.max(leftans.height,rightans.height);
        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root).diameter;
    }
}