class Solution {
    public boolean isPalindrome(String s) {
        int leftPtr = 0;
        int rightPtr = s.length() - 1;
        while(leftPtr < rightPtr){
            if(!Character.isLetterOrDigit(s.charAt(leftPtr))) ++leftPtr;
            else if(!Character.isLetterOrDigit(s.charAt(rightPtr))) --rightPtr;
            else if(Character.toLowerCase(s.charAt(leftPtr)) != Character.toLowerCase(s.charAt(rightPtr))){ 
                return false;
            } else{
                ++leftPtr; 
                --rightPtr;
            }
        }
        return true;
    }
}