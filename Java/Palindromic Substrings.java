class Solution {
    public int countSubstrings(String s) {
         if(s == null || s.length() < 1) return 0;
    int palindromeCount = 0;
    Set<String> substringsSet = new HashSet<>();
    

    
    for(int pivot = 0; pivot <= s.length() * 2 - 1; ++pivot){
        int left = pivot / 2;
        int right = left + pivot % 2;
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ){
            substringsSet.add(s.substring(left, right + 1));
            // console.log(s.substring(left, right + 1));
            ++palindromeCount;
            --left;
            ++right;
        }
    }
     return palindromeCount;
    }
}