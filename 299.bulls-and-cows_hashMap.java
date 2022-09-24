/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                bulls += 1;
        }

        int[] secretTable = new int[10];
        int[] guessTable = new int[10];
        for (char c : secret.toCharArray())
            secretTable[(int) c - '0'] += 1;
        for (char c : guess.toCharArray())
            guessTable[(int) c - '0'] += 1;

        int bigCows = 0;
        for (int i = 0; i < 10; i++) {
            bigCows += Math.min(secretTable[i], guessTable[i]);
        }
        int cows = bigCows - bulls;

        return String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }
}
// @lc code=end

