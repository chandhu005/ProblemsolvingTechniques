/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode temp= A.val<B.val?A:B;
        ListNode head=temp;
        if(A.val<B.val) A=A.next;
        else B=B.next;

        while(A!=null && B!=null){
            if(A.val<B.val){
                temp.next=A;
                A=A.next;
            }
            else{
                temp.next=B;
                B=B.next;
            }
            temp=temp.next;
        }
        if(A==null){
            temp.next=B;
        }
        else {
            temp.next=A;
        }
        return head;
    }
    public ListNode divideList(ListNode A){
        if(A.next==null)
            return A;
        ListNode head1=A;
        ListNode s=A,f=A;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode head2=s.next;
        s.next=null;
        ListNode h1=divideList(head1);
        ListNode h2=divideList(head2);
        return mergeTwoLists(h1,h2);
    }
    public ListNode sortList(ListNode A) {
            if(A==null) return null;
            ListNode ans=divideList(A);
            return ans;
    }
}
