# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoListsMin(self, l1: ListNode, l2: ListNode) -> ListNode:
        l1Ptr = l1
        l2Ptr = l2
        while l2Ptr is not None:
            if l1Ptr.next is None:
                l1Ptr.next = l2Ptr
                l2Ptr = None
            elif l1Ptr.next.val > l2Ptr.val:
                temp = l1Ptr.next
                l1Ptr.next = ListNode(l2Ptr.val)
                l1Ptr = l1Ptr.next
                l1Ptr.next = temp
                l2Ptr = l2Ptr.next
                
            else: 
                l1Ptr = l1Ptr.next
        return l1
    
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1 or not l2: 
            return l1 or l2
        if l1.val > l2.val:
            l2.next = self.mergeTwoLists(l1, l2.next)
            return l2
        else: 
            l1.next = self.mergeTwoLists(l1.next, l2)
            return l1
        
    