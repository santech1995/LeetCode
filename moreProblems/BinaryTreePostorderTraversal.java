//Binary Tree Postorder Traversal

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
    List<Integer> ll = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root != null) {
            ll.add(root.val);
            postorderTraversal(root.left);
            
            postorderTraversal(root.right);
        }
        return ll;
    }
}

//Input = [1,null,2,3]
//Output = [3,2,1]