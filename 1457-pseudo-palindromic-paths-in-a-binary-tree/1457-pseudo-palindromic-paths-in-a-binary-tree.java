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
    int arr[]=new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root.right==null&&root.left==null)
        {
            arr[root.val]++;
            int totalsum=0;
            int oddsum=0;
            for(int i=1;i<=9;i++)
            {
                if(arr[i]!=0)
                {
                    totalsum+=arr[i];
                    if(arr[i]%2!=0)
                    {
                        oddsum++;
                    }
                }
            }
            arr[root.val]--;
            if(totalsum%2==0)
            {
                if(oddsum==0)
                    return 1;
                else
                    return 0;
            }
            else{
                if(oddsum==1)
                {
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }
         arr[root.val]++;
        int sum=0;
        if(root.right!=null)
        {
            sum+=pseudoPalindromicPaths(root.right);
        }
        if(root.left!=null)
        {
            sum+=pseudoPalindromicPaths(root.left);
        }
        arr[root.val]--;
        return sum;
    }
}