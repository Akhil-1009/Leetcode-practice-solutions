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
    Stack<Integer> st=new Stack<>();
    
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        inorderTraversal(root);
        TreeNode result=new TreeNode(-1,null,null);
        TreeNode cur=result;
        while(!st.isEmpty()){
            cur.right=new TreeNode(st.pop(),null,null);
            cur=cur.right;
        }
        return result.right;

    }
    public void inorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inorderTraversal(root.right);
        st.push(root.val);
        inorderTraversal(root.left);
        
    }
}