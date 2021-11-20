class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:      
        result = 0
        result_array = []
        for element in nums:
            result = result + element
            result_array.append(result)
          
        return result_array
            