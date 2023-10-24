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
    public List<Integer> largestValues(TreeNode root) {
        // Create a list to store the largest values at each level of the binary tree.
        List<Integer> list = new LinkedList<>();
        
        // Check if the root is null (empty tree).
        if (root == null) return list;
        
        // Create a queue to perform a level-order traversal of the binary tree.
        Queue<TreeNode> q = new LinkedList<>();
        
        // Add the root node to the queue to start the traversal.
        q.add(root);
        
        // Perform level-order traversal.
        while (!q.isEmpty()) {
            int size = q.size();  // Get the number of nodes at the current level.
            int max = Integer.MIN_VALUE;  // Initialize the maximum value for the current level.
            
            // Iterate through all nodes at the current level.
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();  // Remove the front node from the queue.
                
                // Add the left and right child nodes to the queue if they exist.
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                
                // Update the maximum value for the current level.
                max = Math.max(max, node.val);
            }
            
            // Add the maximum value for the current level to the list.
            list.add(max);
        }
        
        // Return the list of largest values at each level.
        return list;
    }
}