class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int[] maxTop = new int[rows];
        int[] maxLeft = new int[cols];
        
        for(int i = 0; i < rows; i ++){
            int currentMaxAtI = grid[i][0];
            for(int j = 1; j < cols; j ++){
                if(grid[i][j] > currentMaxAtI ) currentMaxAtI = grid[i][j];
            }
            maxLeft[i] = currentMaxAtI;
        }
         for(int i = 0; i < cols; i ++){
            int currentMaxAtI = grid[0][i];
            for(int j = 1; j < rows; j ++){
                if(grid[j][i] > currentMaxAtI ) currentMaxAtI = grid[j][i];
            }
            maxTop[i] = currentMaxAtI;
        }
        
        int height = 0;
        for(int i = 0; i < rows; i ++ ){
            for(int j = 0; j < cols; j ++){
                int currentValue = grid[i][j];
                int column = maxTop[j];
                int row = maxLeft[i];
                if(currentValue >= column || currentValue >= row) continue;
                
                height += column > row ? row - currentValue : column - currentValue;
            }
        }
        return height;
    }
}