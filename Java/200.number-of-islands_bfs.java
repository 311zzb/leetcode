import java.util.Queue;
import java.util.LinkedList;
/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length, nc = grid[0].length;
        int num_island = 0;

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    num_island += 1;
                    grid[r][c] = '0'; // Mark as visited
                    Queue<Integer> neighbors = new LinkedList<>();
                    // Add the current pixel to thq queue, starts the BFS.
                    // r * nc + c: refer to the current pixel with an integer (ID), rather than c and r.
                    neighbors.add(r * nc + c); 
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        // Extract the row and column number from the integer (ID).
                        int row = id / nc, col = id % nc; 
                        
                        if (row - 1 >= 0 && grid[row-1][col] == '1') {
                            neighbors.add((row-1) * nc + col);
                            grid[row-1][col] = '0';
                        }
                          if (row + 1 < nr && grid[row+1][col] == '1') {
                            neighbors.add((row+1) * nc + col);
                            grid[row+1][col] = '0';
                        }
                          if (col - 1 >= 0 && grid[row][col-1] == '1') {
                            neighbors.add(row * nc + col-1);
                            grid[row][col-1] = '0';
                        }
                          if (col + 1 < nc && grid[row][col+1] == '1') {
                            neighbors.add(row * nc + col+1);
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }
        return num_island;
    }
}
// @lc code=end

