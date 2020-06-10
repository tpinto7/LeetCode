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
    public List<Integer> postorderTraversal(TreeNode root) {
        return recursive(root);
    }
    public List<Integer> recursive(TreeNode root){
        List<Integer> nodes = new ArrayList<>();
        if(root != null){
            nodes.addAll(recursive(root.left));
            nodes.addAll(recursive(root.right));
            nodes.add(root.val);
        }
        return nodes;
    }
}