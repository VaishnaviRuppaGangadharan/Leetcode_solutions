class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        array = []
        s_new = s.split()
        for i in range(k):
            array.append(s_new[i])
        listToStr = ' '.join([str(elem) for elem in array])
        return listToStr
            
        