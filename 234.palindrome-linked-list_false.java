import java.util.Stack;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        if (head.next == null) return true;
        s.push(head.val);
        while (head.next != null) {
            head = head.next;
            var newS1 = (Stack<Integer>) s.clone();
            var newS2 = (Stack<Integer>) s.clone();
            newS2.pop();
            System.out.println(newS1);
            if (verify(head, newS1) || verify(head, newS2)) return true;
            s.push(head.val); 
            
        }
        return false;
    }

    private boolean verify(ListNode head, Stack<Integer> stack) {
        if (head == null || stack.size() == 0) {
            if (head == null && stack.size() == 0) 
                return true;
            return false;
        }
        if (head.val != stack.pop()) 
            return false;
        return verify(head.next, stack);

    }
}
// @lc code=end

