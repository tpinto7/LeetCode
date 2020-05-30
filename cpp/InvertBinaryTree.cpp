/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        helper2(root);
        return root;
    }
    
    void helper2(TreeNode* root){
        if(root){
            root = helper(root);
            helper2(root->left);
            helper2(root->right);
        }
    }
    
    TreeNode* helper(TreeNode* root){
     
        TreeNode* temp = root->left;
        root->left = root->right;
        root->right = temp;
        return root;
        
    }
};