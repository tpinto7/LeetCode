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
    bool isUnivalTree(TreeNode* root) {
        bool left_good = true;
        bool right_good = true;
        if(root->left){
            if(root->val != root->left->val) return false;
            left_good = isUnivalTree(root->left);
        }
        if(root->right){
            if(root->val != root->right->val) return false;
            right_good = isUnivalTree(root->right);
        }
        
        return left_good && right_good;
    }
};