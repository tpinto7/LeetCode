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
    int xLevel = -1;
    int yLevel = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> nodes = new LinkedList<>();
        
        nodes.add(root);
        
        while(!nodes.isEmpty()){
            int length = nodes.size();
            boolean xSeen = false;
            boolean ySeen = false;
            for(int i = 0; i < length; ++i){
                TreeNode current = nodes.remove();
                System.out.println(current.val);
                int left = -1; 
                if(current.left != null){
                    nodes.add(current.left);
                    left = current.left.val;
                }
                int right = -1;
                if(current.right != null){
                    nodes.add(current.right);
                    right = current.right.val;
                }
            
                if(left != -1 && (left == x || left == y) &&
                  right != -1 && (right == x || right == y) ) return false;
                
                else if(left == x || right == x) xSeen = true;
                else if(right == y || left == y) ySeen = true;
            }
            if(xSeen != ySeen) return false;
        }
        return true;
        
       // isCousins(root, x, y, 0);
        // return isCousins(root, x, y, 0) && xLevel == yLevel;
    }
    public boolean isCousins(TreeNode root, int x, int y, int currLevel){
        if(root == null) return true;
        if(root.left != null && root.right != null && ((root.left.val == x && root.right.val == y) || (root.right.val == x && root.left.val == y))) return false;
        
        if(root.val == x ){
           xLevel = currLevel;
        }
        if(root.val == y ){
          yLevel = currLevel;
        }
        return isCousins(root.left, x, y, ++currLevel) && isCousins(root.right, x, y, currLevel);
         
    }
}