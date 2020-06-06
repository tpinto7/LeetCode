class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // my first iteration of the solution, which iterated once to get the size
        // of the linked list and a seconf time to remove the desired node
//         ListNode current = head; 
//         int count = 0;
//         while(current != null){
//             current = current.next;
//             ++count;
//         }

//         if(count == n) return head.next;
        
//         ListNode prev = new ListNode(-1);
//         current = head;
//         while(count - n > 0){
//             prev = current;
//             current = current.next;
//             --count;
//         }
//         prev.next = current.next;

//         return head;
        
//         // in my second iteration, I stored the nodes in a list to reduce the passes to 1.
//         // however, this came with the added memory cause of a list of size count. 
//         List<ListNode> nodes = new ArrayList<>();
//          ListNode current = head; 
//         int count = 0;
//         while(current != null){
//             nodes.add(current);
//             current = current.next;
//             ++count;
//         }
//          if(count == n) return head.next;
        
//         nodes.get(count - n - 1).next = nodes.get(count - n).next;
        
//         return head;
        
        // the third iteration was written after reading the solution algorithm idea
        // the idea is to have a 2 two pointers, the second pointer only begins to get iterated 
        // when the first pointer is at the nth node of the list. Thus, when the 1st pointer points 
        // to null, return the 2nd pointer.
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        ListNode second = dummy;
        dummy.next = head;
        first.next = head;
        second.next = head;
        
        for(int i = 0; i <= n; ++i){
            first = first.next;
        }
        
        while(first != null){
            first = first.next; 
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}