/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode current=A;
        ListNode previous=null;
        ListNode head=A;
        if(A.next==null){
            return A;
        }
        while(current!=null){
            if((previous!=null) &&(current.val==previous.val)){
                 previous.next=current.next;
                 current=current.next;
            }
            else{
                previous=current;
                current=current.next;

            }
        }
        return head;
    }
}
