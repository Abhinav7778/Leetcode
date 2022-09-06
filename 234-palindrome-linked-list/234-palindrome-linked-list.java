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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)return true;
        
        ListNode halfPoint = getMid(head);
        ListNode halfRevStart = reverseHalf(halfPoint.next);
        
        while(halfRevStart != null)
        {
            if(halfRevStart.val != head.val)return false;
            head = head.next;
            halfRevStart = halfRevStart.next;
        }
        return true;
    }
    
    public ListNode getMid(ListNode head)
    {
        ListNode fast = head, slow = head;
        
        while(fast.next != null && fast.next.next!= null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode reverseHalf(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!= null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}