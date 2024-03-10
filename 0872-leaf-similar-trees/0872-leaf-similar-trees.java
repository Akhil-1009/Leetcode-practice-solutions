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
    public boolean leafSimilar(TreeNode r1, TreeNode r2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        calcLeaf(r1,arr1);
        calcLeaf(r2,arr2);
        int j=0;
        if(arr1.size()!=arr2.size())return false;
        for(int i:arr1){
            if(i!=arr2.get(j++)){
                return false;
            }
        }
        return true;
    }
    public void calcLeaf(TreeNode n,ArrayList<Integer> arr){
        if(n==null){
            return;
        }
        if(n.left==null&&n.right==null){
            arr.add(n.val);
            return;
        }
        calcLeaf(n.left,arr);
        calcLeaf(n.right,arr);
    }
}