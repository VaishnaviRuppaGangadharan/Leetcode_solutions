class Solution:
    def sortSentence(self, s: str) -> str:
        
        s = s.split(" ")
        array = [""]*len(s)
        for word in s:
            array[int(word[-1])-1]=word[:-1]
            res = " ".join(array)
        return res