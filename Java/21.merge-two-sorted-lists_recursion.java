import java.util.LinkedList;

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    private ListNode rec_mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // Recursion
        int val1 = list1.val, val2 = list2.val;
        if (val1 <= val2) {
            return new ListNode(val1, rec_mergeTwoLists(list1.next, list2));
        } else {
            return new ListNode(val2, rec_mergeTwoLists(list1, list2.next));
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return rec_mergeTwoLists(list1, list2);
    }
}
// @lc code=end
