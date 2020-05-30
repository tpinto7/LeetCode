class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        int size = prices.length;
        int[] left_max = new int[size];
        int[] right_max = new int[size];
        int max = 0;
         left_max[0] = prices[0];
        for(int i = 1; i < size; i ++){
            left_max[i] = Math.min(prices[i], left_max[i-1]);
        }
        right_max[size-1] = prices[size-1];
        for(int i = size - 2; i >= 0; i--){
            right_max[i] = Math.max(prices[i], right_max[i+1]);
        }
        
         for(int i = 0; i < size; i ++){
            if((right_max[i] - left_max[i]) > max) max = right_max[i] - left_max[i];
        }
        return max;
        
    }
}