class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        list=[]
        temp=''
        for x in s:   
            if x not in temp:
                temp += x
            else:
                list.append(len(temp))
                temp=temp[temp.index(x)+1:] + x
        list.append(len(temp))
        return max(list)
                