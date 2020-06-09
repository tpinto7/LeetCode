class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        mergeTreesRecursive(t1, t2);
        return t1;
    }
    public TreeNode mergeTreesRecursive(TreeNode t1, TreeNode t2){
        if(t1 != null && t2 != null){
            t1.val += t2.val;
            t1.left = mergeTreesRecursive(t1.left, t2.left );
            t1.right = mergeTreesRecursive(t1.right, t2.right);
            return t1;
        } else if (t1 != null ){
            return t1;
        } return t2;
        
        
    }
}