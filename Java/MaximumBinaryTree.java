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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode node = recursive(nums, 0, nums.length - 1);
        return node;
    }
    public TreeNode recursive(int[] nums, int left, int right){
        if(right < left) return null;
        if(right == left) return new TreeNode(nums[left]);
        
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = left; i <= right; ++i){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        // System.out.println("left: " + left + " right: " + "index ")
        TreeNode node = new TreeNode(max);
        node.left = recursive(nums, left, index - 1);
        node.right = recursive(nums, index + 1, right);
        return node;
    }
}