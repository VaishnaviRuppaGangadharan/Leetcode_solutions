class Solution:
    def isPalindrome(self, s: str) -> bool:
        list=[]
        for i in range(len(s)):
            if s[i].isalnum():
                list.append(s[i].lower())
        return list==list[::-1]