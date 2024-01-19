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
        ListNode res = new ListNode();
        ListNode dummy = new ListNode(-1, res);
        int carry = 0, sum = 0;
        while(l1 != null && l2 != null)
        {
            sum = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val + carry)/10;
            // System.out.println(" sum 2 " + sum);
            res.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        while(l1!=null)
        {
            sum = (l1.val + carry)%10;
            carry = (l1.val + carry)/10;
                        // System.out.println(" sum 3 " + sum);

            res.next = new ListNode(sum);
            l1 = l1.next;
            res = res.next;
        }
        while(l2!=null)
        {
            sum = (l2.val + carry)%10;
            carry = (l2.val + carry)/10;
            res.next = new ListNode(sum);
            l2 = l2.next;
            res = res.next;
        }
        if(carry!=0)
            res.next = new ListNode(carry);
        return dummy.next.next;
    }
}