/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if (l1 == NULL) {
            return l2;
        }
        if (l2 == NULL) {
            return l1;
        }
        
        ListNode *head = (l1->val > l2->val) ? l2 : l1;
        if (l1->val > l2->val) {
            l2 = l2->next;
        } else {
            l1 = l1->next;
        }
        ListNode *curr = head;
        while (l1 || l2) {
            if (l1 == NULL) {
                curr->next = l2;
                break;
            } else if (l2 == NULL) {
                curr->next = l1;
                break;
            } else {
                if (l1->val < l2->val) {
                    curr->next = l1;
                    curr = curr->next;
                    l1 = l1->next;
                } else {
                    curr->next = l2;
                    curr = curr->next;
                    l2 = l2->next;
                }
            }
        }
        return head;
    }
};