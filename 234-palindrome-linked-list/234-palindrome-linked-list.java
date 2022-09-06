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
        
        List<Integer> al = new ArrayList<>();
        
        while(head != null)
        {
            al.add(head.val);
            head = head.next;
        }
        
        int s = 0, e = al.size() - 1;
        while(s < e)
        {
            if(al.get(s) != al.get(e))
            {
                return false;
            }
            ++s;
            --e;
        }
        return true;
    }
}