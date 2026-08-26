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
    public static ListNode rotate(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr.next = head;
        head = curr;
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        int length = 0;
        ListNode curr = head;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        k = k%length;
        while(k!=0){
            head = rotate(head);
            k--;
        }
        return head;
    }
}