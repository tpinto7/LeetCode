class Solution {
public:
    int uniquePaths(int m, int n) {
        long result = 1;
            
        for (int i = m; i <= m + n - 2; i++) {
            result *= i;
            result /= (i - m + 1);
        }
        
        int int_result = (int) result;
        
        return int_result;
        
        
    }
};