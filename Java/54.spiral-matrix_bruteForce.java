import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    HashSet<Integer> seen = new HashSet<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length; // m row, n column
        int r = 0, c = 0;
        List<Integer> result = new ArrayList<>();

        int direction = 0; // 0=right, 1=down, 2=left, 3=up
        while (seen.size() < m * n) {
            int no = n * r + c;
            seen.add(no);
            System.out.println("adding the element: " + (no+1));
            result.add(matrix[r][c]);

            // determine the next
            boolean rightOK = c + 1 < n && !seen.contains(n * r + c + 1);
            boolean downOK = r + 1 < m && !seen.contains(n * (r + 1) + c);
            boolean leftOK = c - 1 > -1 && !seen.contains(n * r + c - 1);
            boolean upOK = r - 1 > -1 && !seen.contains(n * (r - 1) + c);
            boolean goingRight = direction == 0;
            boolean goingDown = direction == 1;
            boolean goingLeft = direction ==2;
            boolean goingUp = direction == 3;
            
            if (goingRight) {
                if (rightOK) c += 1; 
                else { r += 1; direction = 1; }
            } else if (goingDown) {
                if (downOK) r += 1; 
                else { c -= 1; direction = 2; }
            } else if (goingLeft) {
                if (leftOK) c -= 1; 
                else { r -= 1; direction = 3; }
            } else if (goingUp) {
                if (upOK) r -= 1; 
                else { c += 1; direction = 0; }
            }
        }
        return result;
    }
}
// @lc code=end

