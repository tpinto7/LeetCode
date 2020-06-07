class Solution {
    public boolean isValid(String s) {
        // my first iteration of the problem, using a stack and hashset
        Stack<Character> parenStack = new Stack<Character>();
        Set<Character> leftParen = new HashSet<Character>(Arrays.asList('(', '{', '['));
        for(int i = 0; i < s.length(); ++i){
            char current = s.charAt(i);
            if(leftParen.contains(current)){
                parenStack.push(current);
            } else if (s.charAt(i) == ')'){
                if(!parenStack.isEmpty() && parenStack.peek() == '('){
                    parenStack.pop();
                } else return false;
            }else if (s.charAt(i) == '}'){
                if(!parenStack.isEmpty() && parenStack.peek() == '{'){
                    parenStack.pop();
                } else return false;
            }else if (s.charAt(i) == ']'){
                if(!parenStack.isEmpty() && parenStack.peek() == '['){
                    parenStack.pop();
                } else return false;
            }
        }
        
        return parenStack.isEmpty() ;
        
        // after reading the solutions, I switched my hashset to a hashmap
                Stack<Character> parenStack = new Stack<Character>();
        Map<Character, Character> leftToRight = new HashMap<Character, Character>(){{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        Set<Character> leftParen = new HashSet<Character>(Arrays.asList('(', '{', '['));
        for(int i = 0; i < s.length(); ++i){
            char current = s.charAt(i);
            if(leftToRight.containsKey(current)){
                parenStack.push(current);
            } 
            else{
                if(!parenStack.isEmpty() && leftToRight.get(parenStack.peek()) == s.charAt(i)){
                    parenStack.pop();
                } else return false;
            }
        
        }
        
        return parenStack.isEmpty() ;
        
    }
}