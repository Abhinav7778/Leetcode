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
        ListNode dummy = new ListNode(-1);
        dummy = res;

        int sum = 0, carry = 0;
        while(l1 != null || l2 != null)
        {
            if(l1 != null && l2 != null)
            {
                sum = l1.val + l2.val + carry;

                res.next = new ListNode(sum%10);
                carry = sum/10;

                res = res.next;

                l1 = l1.next;
                l2 = l2.next;
                sum = 0;

            }
            else if(l1 != null)
            {
                sum = l1.val + carry;

                res.next = new ListNode(sum%10);
                carry = sum/10;

                res = res.next;

                l1 = l1.next;
                sum = 0;
            }
            else if(l2 != null)
            {
                sum = l2.val + carry;

                res.next = new ListNode(sum%10);
                carry = sum/10;

                res = res.next;

                l2 = l2.next;
                sum = 0;
            }
        }
        if(carry != 0)
        {
            res.next = new ListNode(carry);
        }
        return dummy.next;
        
    }
}