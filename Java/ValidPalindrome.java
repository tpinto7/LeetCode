class Solution {
    public boolean isPalindrome(String s) {
      int leftIndex = 0;
      int rightIndex = s.length() - 1;
      while(rightIndex > leftIndex){
          if(!Character.isLetterOrDigit(s.charAt(leftIndex)) ) leftIndex ++;
          else if (!Character.isLetterOrDigit(s.charAt(rightIndex)) ) rightIndex--;
          
          else if(!s.substring(leftIndex, leftIndex + 1).equalsIgnoreCase(s.substring(rightIndex, rightIndex + 1))) return false;
          else{
              leftIndex++;
              rightIndex--;
          }
      }
        
        
        return true;
    }
}