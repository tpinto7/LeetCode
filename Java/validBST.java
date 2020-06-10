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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
        public boolean isValidBST(TreeNode root, Integer lowerLimit, Integer upperLimit){
        if(root == null) return true;
        if(lowerLimit != null && root.val <= lowerLimit || upperLimit != null && root.val >= upperLimit) return false;
        if(root.left != null && root.val <= root.left.val) return false;
        if(root.right != null && root.val >= root.right.val) return false;
            
        return isValidBST(root.left,lowerLimit , root.val ) && isValidBST(root.right, root.val, upperLimit);
    }
}