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
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode pointer1 = head;
        ListNode pointer2 = head.next;
        while (pointer2 != null) {
            if (pointer2 == pointer1) {
                return true;
            } else {
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
                if (pointer2 == null) {
                    return false;
                } else {
                    pointer2 = pointer2.next;
                }
            }
        }
        return false;
    }
}
