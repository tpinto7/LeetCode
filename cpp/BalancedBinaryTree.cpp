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
    bool isBalanced(TreeNode* root) {
        bool correct = true;
        if(root){
            int left = 0;
            maxHeight(root->left, 0, left);
            int right = 0;
            maxHeight(root->right, 0, right);
            
            if( right - left > 1 || left - right > 1){
                cout << left << endl;
                cout << right << endl;
                return false;
            }
            if( root->left){
                correct = correct && isBalanced(root->left);
            }
            if( root->right){
                correct = correct && isBalanced(root->right);
            }
        }
        return correct;
    }
    
    void maxHeight(TreeNode* root, int calls, int& max_height){
        if(root){
            calls++;
            if( calls > max_height ) max_height = calls;
            maxHeight(root->left, calls, max_height);
            maxHeight(root->right, calls, max_height);
        }
    }
};