/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        int lenA = 0;
        int lenB = 0;

        ListNode a = headA;
        ListNode b = headB;

        // Find length of A
        while (a != null) {
            lenA++;
            a = a.next;
        }

        // Find length of B
        while (b != null) {
            lenB++;
            b = b.next;
        }

        // Move the longer list ahead
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse together
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}