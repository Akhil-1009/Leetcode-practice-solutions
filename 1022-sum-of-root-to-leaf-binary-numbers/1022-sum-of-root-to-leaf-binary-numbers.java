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
    public int  helper(TreeNode root,List<Integer> arr)
    {
        if(root.left==null&&root.right==null)
        {  arr.add(root.val);
            int num=0;
            int i=arr.size()-1;
            int j=0;
            while(i>=0)
            {  if(arr.get(j++)==1)
            {
                num+=Math.pow(2,i);
            }
                i--;
            }
         arr.remove(arr.size()-1);
            return num;
        }
        int sum=0;
        arr.add(root.val);
        if(root.left!=null)
        {
        sum+=helper(root.left,arr);
        }
        if(root.right!=null)
        {
        sum+=helper(root.right,arr);
        }
        arr.remove(arr.size()-1);
        return sum;
    }
    public int sumRootToLeaf(TreeNode root) {
     ArrayList<Integer> arr=new ArrayList<Integer>();
        return helper(root,arr);
    }
}