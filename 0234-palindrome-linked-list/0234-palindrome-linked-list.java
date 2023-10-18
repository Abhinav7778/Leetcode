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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode mid = middle(head);
        ListNode rev = reverseLinkedlist(mid.next);
        
        while(rev != null && head != null)
        {
             // System.out.println(" head " + head.val + " rev " + rev.val + " revval  != headval " + (rev.val != head.val));
            if(rev.val != head.val) 
                return false;
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
    public ListNode middle(ListNode head)
    {
        ListNode slow = head, fast= head;
        
        while(fast.next!= null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode reverseLinkedlist(ListNode head)
    {
        ListNode prev = null;
        
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}