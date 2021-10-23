class Solution:
    def myAtoi(self, s: str) -> int:
        sign=1
        result=0                                                                    
        s = s.strip()
        if s == "":
            return 0
        if s[0] == "+":
            s=s[1:]
            sign=1
        elif s[0] == "-":
            s=s[1:]
            sign=-1
        else:
            sign=1
        
        for character in s:
            if '0'<=character<='9':
                result = result*10 + int(character)
            else:
                break
                
        result=result*sign
        
        if result<-2147483648:
            return -2147483648
        elif result>2147483647:
            return 2147483647
        
        return result
        
    
    
         
                
        
        
            
        