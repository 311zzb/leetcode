/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode rabbit = head, turtle1 = head;
        do {
            if (rabbit == null || rabbit.next == null) {
                return null;
            }
            rabbit = rabbit.next.next;
            turtle1 = turtle1.next;
        } while (rabbit != turtle1);
        
        ListNode turtle2 = head;
        while (turtle2 != turtle1) {
            turtle1 = turtle1.next;
            turtle2 = turtle2.next;
        }
        return turtle2;
    }
}
// @lc code=end

