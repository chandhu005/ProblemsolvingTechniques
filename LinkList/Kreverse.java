/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
         ListNode h3=A;
        ListNode h1=A;
        ListNode h2=null;
        ListNode temp=null;
        int tempB=B; 
        if(A==null || B==0){
            return A;
        }
        while(B>0 && h1!=null){
              temp=h1;
              h1=h1.next;
              temp.next=h2;
              h2=temp;
              B--;
        }
        h3.next=reverseList(h1,tempB);
        return h2;
    }
    
}
