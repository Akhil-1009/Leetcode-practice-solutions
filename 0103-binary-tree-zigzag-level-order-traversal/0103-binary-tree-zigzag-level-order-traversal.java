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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> s=new Stack<TreeNode>();
        Stack<TreeNode> t=new Stack<TreeNode>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        int flag=0;
        s.add(root);
        while(!s.isEmpty()||!t.isEmpty())
        { List<Integer> temp=new ArrayList<Integer>();
            if(flag==0)
        {   int size=s.size();
         for(int i=1;i<=size;i++)
         {
            TreeNode current=s.pop();
             temp.add(current.val);
             if(current.left!=null)
             {
                 t.add(current.left);
             }
              if(current.right!=null)
             {
                 t.add(current.right);
             }
             flag=1;
         }
                
        }
         else{
             int size=t.size();
         for(int i=1;i<=size;i++)
         {
            TreeNode current=t.pop();
             temp.add(current.val);
             
              if(current.right!=null)
             {
                 s.add(current.right);
             }
             if(current.left!=null)
             {
                 s.add(current.left);
             }
             flag=0;
         }
         }
         ans.add(temp);
            
        }
        return ans;
    }
}