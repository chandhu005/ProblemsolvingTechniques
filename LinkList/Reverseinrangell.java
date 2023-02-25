/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
  

 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (B == C) {
            return A;
        }

        // skip the first left-1 nodes
        ListNode current = A;
        ListNode prev = null;
        for (int i = 0; current != null && i < B - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < C - B + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            A = prev;
        }

        newEnd.next = current;
        return A;
    }
}
