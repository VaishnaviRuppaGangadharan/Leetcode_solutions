# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        p = head
        pf = head
        while pf and pf.next:
            pf = pf.next.next
            p = p.next
            
        return p
            