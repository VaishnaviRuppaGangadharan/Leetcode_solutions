class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []
        for itr in range(len(nums)):
            if itr+n < len(nums):
                result.append(nums[itr])
                result.append(nums[itr+n])
        return result
                
        