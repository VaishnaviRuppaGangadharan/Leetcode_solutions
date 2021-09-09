class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums=sorted(nums)
        uniquenums=set(nums)
        for i in uniquenums:
            if(nums.count(i))>floor(len(nums)/2):
                return i
        
        