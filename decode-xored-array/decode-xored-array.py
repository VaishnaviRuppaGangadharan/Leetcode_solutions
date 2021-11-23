class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        
        array = []
        array.append(first)
        for i in range(len(encoded)):
            array.append(array[i]^encoded[i])
        return array
            
        