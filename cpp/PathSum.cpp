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
    bool hasPathSum(TreeNode* root, int sum) {
       return helperHasPath(root, sum, 0);
    }
    
    bool helperHasPath(TreeNode* root, int sum, int current_sum){
        bool has_path = false;
        
        if(root){
            current_sum += root->val;
            if(current_sum == sum){
                if( root->left == NULL && root->right == NULL) return true;
            }
            has_path = has_path || helperHasPath(root->left, sum, current_sum);
            has_path = has_path || helperHasPath(root->right, sum, current_sum);
        }
        return has_path;
        
    }
};