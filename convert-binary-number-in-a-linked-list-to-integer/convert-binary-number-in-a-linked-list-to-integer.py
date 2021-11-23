# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
     def getDecimalValue(self, head: ListNode) -> int:
        string = ''
        while head:
            string+=str(head.val)
            head = head.next
        count =0
        ans = 0
        for i in range(len(string)-1,-1,-1):
            ans += (2**count)*int(string[i])
            count+=1

        return ans
#         string = ''
#         while head:
#             string = string + str(head.val)
#             head = head.next
            
#         count, answer = 0, 0
#         for i in range(len(string)-1,-1,-1):
#             answer = (2**count)*int(string[i])
#             count+=1
#         return answer
    
         