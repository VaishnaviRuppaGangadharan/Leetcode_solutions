class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        result = []
        sorted_array = sorted(nums)
        for i,num in enumerate(sorted_array):
            if num == target:
                result.append(i)
            
        return result
        