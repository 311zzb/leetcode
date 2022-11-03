/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        n = lenOfLinkedList(head) - n;
        return helper(head, n);
    }

    private ListNode helper(ListNode head, int n) {
        if (n == 0)
            return head.next;
        return new ListNode(head.val, helper(head.next, n - 1));
    }

    private int lenOfLinkedList(ListNode head) {
        int len = 0;
        while (head != null) {
            len += 1;
            head = head.next;
        }
        return len;
    }
}
// @lc code=end

