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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        int carry = 0, sum = 0;
        while(l1!=null && l2!= null)
        {
            sum = (l1.val + l2.val + carry) %10;
            res.next = new ListNode(sum);
            carry = (l1.val + l2.val + carry) / 10;
            l1=l1.next;l2=l2.next;
            res = res.next;
        }
        while(l1!=null)
        {
            // System.out.println(" l1val " + l1.val + " carry "+carry);
            sum = (l1.val + carry) % 10;
            res.next = new ListNode(sum);
            carry = (l1.val + carry) /10;
            l1 = l1.next; res = res.next;
        }
        while(l2!=null)
        {
            sum = (l2.val + carry) % 10;
            res.next = new ListNode(sum );
            carry = (l2.val + carry) /10;
            l2=l2.next; res = res.next;
        }
        if(carry!=0)
        {
            res.next = new ListNode(1);
        }
        
        return dummy.next;
        
    }
}