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
/*This is iterative approach*/
/*Refer to solution by Naresh Gupta youtube*/
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> s = new Stack();
        s.add(root);
        TreeNode dummyRoot = new TreeNode(0);
        TreeNode current = dummyRoot;
        root = root.left;
        while(!s.isEmpty() || root != null) {
            while(root != null) {
                s.add(root);
                root = root.left;
            }
            TreeNode temp = s.pop();
            current = current.right = new TreeNode(temp.val);
            if(temp.right != null)
                root = temp.right;
        }
        return dummyRoot.right;
    }
}