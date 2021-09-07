class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        counts={}
        for num in nums:
            if num not in counts:
                counts[num]=1
            else:
                counts[num]+=1
        key_list=counts.keys()
        
        for key in key_list: 
            if counts[key]==1:
                return key
        