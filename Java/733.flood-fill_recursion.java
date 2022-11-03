/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    private int[][] helper(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >=image[0].length)
            return image;
        if (image[sr][sc] == color || image[sr][sc] != originalColor)
            return image;
        
        image[sr][sc] = color;
        image = helper(image, sr + 1, sc, color, originalColor);
        image = helper(image, sr - 1, sc, color, originalColor);
        image = helper(image, sr, sc + 1, color, originalColor);
        image = helper(image, sr, sc - 1, color, originalColor);
        return image;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return helper(image, sr, sc, color, image[sr][sc]);   
    }
}
// @lc code=end
