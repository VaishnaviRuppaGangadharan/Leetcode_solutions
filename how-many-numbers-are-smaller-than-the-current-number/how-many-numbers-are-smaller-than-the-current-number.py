class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        array = []
        
        for i in range(0, len(nums)):
            count = 0
            for j in range(0, len(nums)):
                if (nums[i] > nums[j] and i!=j):
                    count+=1
            array.append(count)
        return array
                
        