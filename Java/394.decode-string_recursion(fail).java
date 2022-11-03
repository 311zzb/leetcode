/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start
class Solution {
    

    private String helper (String s, int repeatingNum) {
        System.out.print("repeating: " + s);
        System.out.println(" for " + repeatingNum);
        String repeatedString = s.repeat(repeatingNum);
        System.out.println(repeatedString);
        return decodeString(repeatedString);
    }

    public String decodeString(String s) {
        int layerOfEncode = 0;
        int repeatingNum = 0;
        int repeatStart = 0, repeatEnd = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                result.append(c);
            } else if (Character.isDigit(c)) {
                if (layerOfEncode == 0) {
                    repeatingNum = Integer.valueOf(c - '0');
                    repeatStart = i + 2;
                }
            } else if (c == '[') {
                layerOfEncode += 1;
            } else if (c == ']') {
                layerOfEncode -= 1;
                if (layerOfEncode == 0) {
                    repeatEnd = i;
                    String repeatString = s.substring(repeatStart, repeatEnd);
                    // System.out.println(repeatString);
                    result.append(helper(repeatString, repeatingNum));
                }
            }
        }
        return result.toString();
    }
}
// @lc code=end

