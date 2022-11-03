import java.util.Arrays;

/*
 * @lc app=leetcode id=2131 lang=java
 *
 * [2131] Longest Palindrome by Concatenating Two Letter Words
 */

// @lc code=start
class Solution {
    private boolean midUsed = false;

    public int longestPalindrome(String[] words) {
        for (String word : words) 
            System.out.print(word + " ");
        System.out.println("");

        if (words.length == 1) {
            if (isPalindrome(words[0])) return 2;
            return 0;
        }
        
        String curr = words[0];
        String[] newWords = Arrays.copyOfRange(words, 1, words.length);

        String currReverse = new StringBuilder(curr).reverse().toString();
        int useCurr = 0;
        int indexOfReverse = -1;
        for (int i = 0; i < newWords.length; i++) {
            if (currReverse.equals(newWords[i])) {
                useCurr = 4;
                indexOfReverse = i;
                break;
            }
        }
        if (useCurr == 0 && isPalindrome(curr) && !midUsed) {
            useCurr = 2;
            midUsed = true;
        }

        if (indexOfReverse != -1) {
            String[] newWordsWithoutReversed = new String[newWords.length];
            for (int i = 0, j = 0; i < newWords.length; i++) {
                if (i != indexOfReverse) 
                    newWordsWithoutReversed[j++] = newWords[i];
            }
            useCurr += longestPalindrome(newWordsWithoutReversed);
        }
        
        int notUseCurr = longestPalindrome(newWords);
        
        return Math.max(useCurr, notUseCurr);
    }

    // Check if a string is palindrome
    private boolean isPalindrome(String s) {
        var chars = s.toCharArray();
        int len = chars.length;
        int front = 0, back = len - 1;
        while (front < back) {
            if (chars[front] != chars[back]) return false;
        }
        return true;
    }

}
// @lc code=end

