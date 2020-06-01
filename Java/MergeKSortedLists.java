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
import java.util.PriorityQueue;


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(ListNode node : lists){
            while(node != null){
                queue.add(node.val);
                node = node.next;
            }
        }
        ListNode nodeToReturn = null;
        
        if(queue.size() == 0 ) return nodeToReturn;
        
        nodeToReturn = new ListNode();
        nodeToReturn.val = queue.remove();
        ListNode current = nodeToReturn;
        ListNode next = null;
        while(queue.size() > 0 ){
            next = new ListNode();
            next.val = queue.remove();
            current.next = next;
            current = next;
        
            
        }
     
        return nodeToReturn;
    }
}