# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        
        while head and head.val == val:
            head = head.next
            
        if head is None:
            return None
        
        previous = head
        current = head.next
        
        while current is not None:
            if current.val == val:
                previous.next = previous.next.next
            else:
                previous = current
            current = current.next
        
        return head
            
            
            
        