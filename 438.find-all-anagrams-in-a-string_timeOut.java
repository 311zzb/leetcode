import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    HashMap<Character, Integer> pChar = new HashMap<>();

    private boolean isAnagram(String s) {
        HashMap<Character, Integer> temp = new HashMap<>(pChar);
        for (char c : s.toCharArray()) {
            if (!temp.containsKey(c) || temp.get(c) < 1)
                return false;
            temp.put(c, temp.get(c) - 1);
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        
        for (char c : p.toCharArray()) {
            if (!pChar.containsKey(c)) {
                pChar.put(c, 1);
            } else {
                pChar.put(c, pChar.get(c) + 1);
            } 
        }
        System.out.println(pChar);

        int focusLength = p.length();
        for (int i = 0; i <= s.length() - focusLength; i++) {
            String check = s.substring(i, i + focusLength);
            if (isAnagram(check))
                result.add(i);
        }
        return result;
    }
}
// @lc code=end

