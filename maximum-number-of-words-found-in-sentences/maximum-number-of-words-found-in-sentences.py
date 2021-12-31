class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        array = []
        for sentence in sentences:
            count = 0
            words = sentence.split(' ')
            for word in words:
                count += 1
            array.append(count)
        print(array)
        max_val = max(array)
        print(max_val)
        return max_val
            
            
            
        