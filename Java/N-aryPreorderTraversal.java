/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        return recursive(root);
    }
    public List<Integer> recursive(Node root){
        List<Integer> nodes = new ArrayList<>();
        if(root != null){
            nodes.add(root.val);
            for(int i = 0; i < root.children.size(); ++i){
                nodes.addAll(recursive(root.children.get(i)));
            }
        }
        return nodes;
    }
}