# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 is None:
            return l2
        if l2 is None:
            return l1
        head = None
        curr = None
        while l1 is not None and l2 is not None:
            if l1 is None:
                curr.next = l2
                break
            elif l2 is None:
                curr.next = l1
                break
            else:
                if l1.val < l2.val:
                    if (curr == None):
                        head = l1
                        curr = l1
                    else:
                        curr.next = l1.next
                        curr = curr.next
                    l1 = l1.next
                else:
                    if (curr == None):
                        head = l2
                        curr = l2
                    else:
                        curr.next = l2.next
                        curr = curr.next

                    l2 = l2.next
        return head