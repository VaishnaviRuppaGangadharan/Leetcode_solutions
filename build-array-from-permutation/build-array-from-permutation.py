class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        result = []
        for element in nums:
            result.append(nums[element])
        return result
        