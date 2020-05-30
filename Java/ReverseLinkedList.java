/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return recursive(head, null);
    }
    
    public ListNode recursive(ListNode head, ListNode prev){
        if(head == null) return prev;
        ListNode next = head.next; 
        head.next = prev;
        prev = head;
        head = next;
        return recursive(head, prev);
    }
    
}