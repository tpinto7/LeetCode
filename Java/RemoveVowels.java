class Solution {
    public String removeVowels(String S) {
        // this was my implementation
        Character[] VOWELS_VALUES = new Character[]{'a','e','i', 'o','u'};
        HashSet<Character> vowels = new HashSet<>(Arrays.asList(VOWELS_VALUES));
        String returnStr = "";
        for(int i = 0; i < S.length(); ++i){
            if(!vowels.contains(S.charAt(i))){
                returnStr += S.charAt(i);
            }
        }
        return returnStr;
        
        // a possible implementation using regex
        return S.replaceAll("[aeiou]", "");
        
        
        // a possible implementation using StringBuilder. this is the fastest implementation
        String v ="oeiuaAEIUO";

        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray())
        {
            if(v.indexOf(c)==-1)
                sb.append(c);
        }

        return sb.toString();
        }
}