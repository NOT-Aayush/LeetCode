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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null || head.next == null){
            return null;
        }
        int len=0;
        ListNode cnt = head;
        while(cnt!=null){
            len++;
            cnt=cnt.next;
        }
        int count =1;
        ListNode prev = new ListNode();
        ListNode curr = head;
        while(curr!=null){
            if(count == len-n+1){
                prev.next = curr.next;
                return head;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}