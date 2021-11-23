class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        word1new=''.join(word1)
        word2new=''.join(word2)
        return word1new == word2new
            
        