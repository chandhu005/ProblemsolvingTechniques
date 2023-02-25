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
        if(A==null) return B;
        if(B==null) return A;
        ListNode h3=null;
        ListNode temp=null;
        if(A.val<B.val){
                h3=A;
            temp=A;
            A=A.next;
            //temp=temp.next;
            }
            else{
                h3=B;
                temp=B;
              B=B.next;
              //temp=temp.next;
            }
        while(A!=null && B!=null){
            if(A.val<B.val){
                //h3=A;
            temp.next=A;
            A=A.next;
            temp=temp.next;
            }
            else{
               temp.next=B;
            B=B.next;
            temp=temp.next;  
            }
        }
        if(A!=null){
            temp.next=A;
        }
        else{
            temp.next=B;
        }
        return h3;
    }
}
