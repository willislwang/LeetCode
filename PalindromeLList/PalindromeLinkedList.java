/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PalindroneLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int len = findLength(head);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            if (i < len / 2) {
                System.out.println("push " + head.val);
                stack.push(head.val);
            } else if (i == len / 2 && len % 2 != 0) {
            } else {
                if (stack.peek() != head.val) {
                    return false;
                } else {
                    System.out.println("pop " + head.val);
                    stack.pop();
                }
            }
            head = head.next;
        }
        return true;   
    }
    public int findLength(ListNode head) {
        ListNode pointer = head;
        int len = 0; 
        while (pointer != null) {
            pointer = pointer.next;
            len++;
        } 
        return len;
    }
}
