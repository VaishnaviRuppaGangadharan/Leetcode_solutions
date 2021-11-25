# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr is not None:
            if prev and prev.val == curr.val:
                prev.next = prev.next.next
            else:
                prev = curr
            curr = curr.next
        return head
                
        