import java.util.Random;

/*
 * @lc app=leetcode id=382 lang=java
 *
 * [382] Linked List Random Node
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
    Random ran = new Random();
    ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        int length = listNodeLength(this.head);
        int x = this.ran.nextInt(length);
        return getNthNode(x, this.head).val;
    }

    private static int listNodeLength(ListNode head) {
        if (head.next == null) {
            return 1;
        }
        return 1 + listNodeLength(head.next);
    }

    private static ListNode getNthNode(int n, ListNode head) {
        if (n == 0) {
            return head;
        }
        return getNthNode(n - 1, head.next);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
// @lc code=end

