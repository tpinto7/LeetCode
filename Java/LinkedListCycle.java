public class Solution {
    public boolean hasCycle(ListNode head) {
        // My first iteration used a map to check if any nodes had already 
        // been encountered. If so, it is a cycle.
        Map<ListNode, ListNode> nodes = new HashMap<>();
        
        while(head != null){
            if(nodes.containsKey(head)) return true;
            nodes.put(head, head);
            head = head.next;
            
        }
        return false;
        
        // In my second iteration, I used a slow and fast pointer. 
        // If they intersect, then there must be a cycle.
        // This was a 100% runtime solution :) 
        if(head != null && head.next != null){
            ListNode fast = head.next;
            ListNode slow = head;

            while(fast != null && fast.next != null){
               if(fast == slow) return true;
                fast = fast.next.next; 
                slow = slow.next;
            }
        }
        return false;
    }
}