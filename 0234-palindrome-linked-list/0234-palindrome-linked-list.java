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
     
        ListNode mid = findMid(head);
        
        ListNode rev = reverse(mid);
        
        while(rev != null && head!=null)
        {
            if(rev.val != head.val)
                return false;
            rev = rev.next;
            head = head.next;
        }
        
        return true;
    }
    
    public ListNode findMid(ListNode head)
    {
        ListNode fast = head, slow = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode rev = null;
        
        while(head!=null)
        {
            ListNode temp = head.next;
            head.next = rev;
            rev = head;
            head = temp;
        }
        return rev;
    }
}