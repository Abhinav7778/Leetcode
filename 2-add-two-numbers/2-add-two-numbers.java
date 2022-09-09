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
        
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        
        int c = 0, sum = 0;
        while(l1 != null && l2 != null)
        {
            sum = (l1.val + l2.val + c)%10;
            
            c = (l1.val + l2.val + c)/10;
        
            res.next = new ListNode(sum);
            
            l1 = l1.next;
            
            l2 = l2.next;
            
            res = res.next;
            
        }
        
        while(l1 != null)
        {
            sum = (l1.val + c)%10;
            c = (l1.val + c)/10;
            res.next = new ListNode(sum);
            l1 = l1.next;
            res = res.next;
        }
        while(l2 != null)
        {
            sum = (l2.val + c)%10;
            c = (l2.val + c)/10;
            res.next = new ListNode(sum);
            l2 = l2.next;
            res = res.next;
        }
        if(c != 0)
        {
            res.next = new ListNode(c);
        }
        return temp.next;
    }
}