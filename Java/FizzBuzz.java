class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returnString = new ArrayList<String>();
        for(int i = 1; i <= n; ++i){
            // To improve, could reduce number of condition checks ... this would be with string concatenation:
            // if(i % 3 == 0) string += "Fizz"
            // if(i % 5 == 0) string += "Buzz"
            if(i % 15 == 0){
                returnString.add("FizzBuzz");
            } else if (i % 5 == 0){
                returnString.add("Buzz");
            } else if (i % 3 == 0){
                returnString.add("Fizz");
            } else{
                returnString.add(String.valueOf(i));
            }
        }
        return returnString;
    }
}