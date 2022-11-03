/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    private ListNode rec_reverseList(ListNode head, ListNode prev) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Recursion
        ListNode newList = rec_reverseList(head.next, head);
        ListNode curr = newList;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(head.val);
        return newList;
    }

    public ListNode reverseList(ListNode head) {
        return rec_reverseList(head, null);
    }
}
// @lc code=end

