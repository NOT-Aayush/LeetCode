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
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        ListNode curr = l1;
        while(curr!=null){
            s1.append((int)curr.val);
            curr=curr.next;
        }
        s1.reverse();
        curr = l2;
        while(curr!=null){
            s2.append((int)curr.val);
            curr=curr.next;
        }
        s2.reverse();
        long n1 = Long.parseLong(s1.toString());
        long n2 = Long.parseLong(s2.toString());
        long n3 = n1 + n2;
        StringBuilder s3 = new StringBuilder(Long.toString(n3));
        s3.reverse();
        int n = s3.length();
        ListNode head = new ListNode();
        head.val = s3.charAt(0) - '0';
        curr = head;
        for (int i=1;i<n;i++){
            ListNode temp = new ListNode();
            temp.val = s3.charAt(i) - '0';
            curr.next = temp;
            curr = curr.next;
        }
        curr.next=null;
        return head;
    }
}