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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null) return l;
        st.push(root);
        while(st.size()!=0)
        {
            TreeNode front=st.pop();
             l.add(front.val);
             if(front.right!=null)
                 st.push(front.right);
             if(front.left!=null)
                 st.push(front.left);
            
        }
        return l;
        
    }
}