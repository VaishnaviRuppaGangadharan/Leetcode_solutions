class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        array = []
        for i in range(0,len(nums),2):
            n = nums[i]
            for j in range(n):
                array.append(nums[i+1])
        return array