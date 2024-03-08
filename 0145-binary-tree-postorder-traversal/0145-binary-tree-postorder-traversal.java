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
    public void helper(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,arr);
        helper(root.right,arr);
        arr.add(root.val);
        
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<Integer>();
        helper(root,arr);
        return arr;
    }
}