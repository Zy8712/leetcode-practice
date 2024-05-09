class Solution {
    public int islandPerimeter(int[][] grid) {
        // Based on testing # of blocks to perimeter, aprox. eq. is 2x+2 where x # # of
        // island blocks
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i > 0 && grid[i - 1][j] == 0 || i == 0) {
                        counter++;
                    }
                    if ((j > 0 && grid[i][j - 1] == 0) || j == 0) {
                        counter++;
                    }
                    if((i < grid.length - 1 && grid[i+1][j] == 0) || i == grid.length - 1){
                        counter++;
                    }
                    if((j < grid[i].length - 1 && grid[i][j+1] == 0) || j == grid[i].length - 1){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}