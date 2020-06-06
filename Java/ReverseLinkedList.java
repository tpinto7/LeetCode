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
    public ListNode reverseList(ListNode head) {
        return recursive(null, head);
    }
    
    public ListNode recursive(ListNode prev, ListNode current){
        if(current != null ){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            return recursive(prev, current);
        }
        else return prev; 
    }
}