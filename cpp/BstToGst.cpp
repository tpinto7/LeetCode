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
    TreeNode* bstToGst(TreeNode* root) {
        vector<int> myVector;
        build(root, myVector);
        replaceSums(root, myVector);
        return root;
    }
    
    void replaceSums(TreeNode* root, vector<int>& myVector){
        if(root == NULL) return;
        int sum = 0;
        for(int i = 0; i < myVector.size(); ++i){
            if(myVector[i] >= root->val) sum += myVector[i];
        }
        root->val = sum;
        replaceSums(root->left, myVector);
         replaceSums(root->right, myVector);
    }
    
     void build(TreeNode* root, vector<int>& myVector){
        if(root == NULL) return;
        build(root->left, myVector);
        myVector.push_back(root->val);
        build(root->right, myVector);
        
    }
};