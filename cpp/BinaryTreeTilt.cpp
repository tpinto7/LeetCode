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
    int findTilt(TreeNode* root) {
        int tot = 0;
        helper1(root, tot);
        return tot;
    }
    
    void helper1(TreeNode* root, int& total){
        if(root){
            total += helper2(root);
            helper1(root->left, total);
            helper1(root->right, total);
        }
    }
    
    int helper2(TreeNode* root){
       int left_value = helper3(root->left);
       int right_value = helper3(root->right);
       
        return right_value > left_value ? right_value - left_value : 
                                          left_value - right_value;
    }
    int helper3(TreeNode* root){
        int sum = 0;
        if(root){
            sum += helper3(root->left);
            sum += helper3(root->right);
            return sum + root->val;
        }
        return sum;
    }
};