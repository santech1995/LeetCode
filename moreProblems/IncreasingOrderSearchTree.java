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
    TreeNode current;
    
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyRoot = new TreeNode(0);
        current = dummyRoot;
        inorder(root);
        return dummyRoot.right;
    }
    private void inorder(TreeNode root) {
        if(root == null) 
            return;
        inorder(root.left);
        root.left = null;
        current = current.right = root;
        inorder(root.right);
    }
}