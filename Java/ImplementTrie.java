class Trie {

    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
        
        TrieNode(){
            isEndOfWord = false;
            for(int i = 0; i < children.length; ++i){
                children[i] = null;
            }
        }
    };
    static TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode temp = root;
        for(int i = 0; i < word.length(); ++i){
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new TrieNode();
            }else{
                temp.isEndOfWord = false;
            }
            temp = temp.children[index];    
        }
        
        // last node inserted will be last node
        temp.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode temp = root; 
        for(int i = 0; i < word.length(); ++i){
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null) return false;
            else{
                temp = temp.children[index];
            }
        }
        return temp.isEndOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode temp = root; 
        for(int i = 0; i < prefix.length(); ++i){
            int index = prefix.charAt(i) - 'a';
            if(temp.children[index] == null) return false;
            else{
                temp = temp.children[index];
            }
        }
        return startsWithHelper(temp);
    }
    public boolean startsWithHelper(TrieNode temp){
        if(temp == null) return false;
        boolean childrenTrue = false;
        for(int i = 0; i < 26; ++i){
            childrenTrue = childrenTrue || startsWithHelper(temp.children[i]);
        }
        return childrenTrue || temp.isEndOfWord;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */