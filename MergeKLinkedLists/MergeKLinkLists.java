/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKLinkedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKListsHelper(lists, null, null);
    }
    public ListNode mergeKListsHelper(ListNode[] lists,  ListNode curr, ListNode origin) {
        int smallestIndex = -1;
        boolean isEmpty = true;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && (smallestIndex == -1 || lists[smallestIndex].val > lists[i].val)) {
                smallestIndex = i;
                isEmpty = false;
            }
        }
        if (isEmpty) return origin;
        if (origin == null) {
            origin = lists[smallestIndex];
            curr = origin;
        } else {
            curr.next = lists[smallestIndex];
            curr = curr.next;
        }
        lists[smallestIndex] = lists[smallestIndex].next;
        return mergeKListsHelper(lists, curr, origin);
    }
}
