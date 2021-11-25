# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, head1: Optional[ListNode], head2: Optional[ListNode]) -> Optional[ListNode]:
        
        if head1 is None:
            return head2
        elif head2 is None:
            return head1
        
        head3 = ListNode(0)
        result = head3
        
        while (head1 is not None and head2 is not None):
            if head1.val <= head2.val:
                head3.next = head1
                head1 = head1.next
                
            elif head2.val < head1.val:
                head3.next = head2
                head2 = head2.next
                
            head3 = head3.next
            
        if head1 is None:
            head3.next = head2
        elif head2 is None:
            head3.next = head1
            
        return result.next
                
        
        