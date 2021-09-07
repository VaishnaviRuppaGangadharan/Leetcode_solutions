class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        counts={}
        for num in nums:
            if num not in counts:
                counts[num]=1
            else:
                counts[num]+=1
                
        keylist=counts.keys()
        keys=[]
        for key in keylist:
            if counts[key]==1:
                keys.append(key) 
        return keys
        