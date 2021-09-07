class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        counts={}
        for num in nums:
            if num not in counts:
                counts[num]=1 
            else:
                del counts[num]
                
                
        return list(counts.keys())[0]
                