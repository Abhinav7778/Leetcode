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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        
        ListNode f = dummy, s = dummy;
        int i = 1;
        while(i <= n)
        {
            f = f.next;++i;
        }
        while(f.next != null)
        {
            f = f.next;
            s = s.next;
        }
        
        s.next = s.next.next;
        return dummy.next;
     
    }
}