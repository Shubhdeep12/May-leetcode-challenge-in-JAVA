/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null || head.next.next==null){
            return head;
        }
        sort(head,1,head.next);
        
        return head;
    }
    public void sort(ListNode head,int i,ListNode second) {
        
            ListNode n=head.next;
                if(head.next==null){
                    if(i%2!=0){
                    head.next=second;
                    }
                    else{
                        head.next=null;
                    sort(n,i+1,second);
                    }
                }
                else if(head.next.next==null){
                   if(i%2!=0){
                       head.next=second;
                   }
                    else{
                        
                    
                    head.next=null;
                    sort(n,i+1,second);
                    }
                }
                else{
                
                head.next=head.next.next;
                sort(n,i+1,second);
                }
    }
}