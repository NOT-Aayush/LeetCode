/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow.next!=null && fast.next.next!=null){
            slow = slow.next;
            if (slow.next == fast.next){
                return true;
            }
            fast = fast.next.next;

        }
        return false;
    }
}