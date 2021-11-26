class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        sum = 0
        for element in nums:
            if nums.count(element)==1:
                sum = sum + element
        return sum
                
            
        
        
        
        
        