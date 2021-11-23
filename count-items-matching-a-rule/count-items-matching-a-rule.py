class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        count = 0
        index = 2
        if ruleKey == "type":
            index = 0    
        elif ruleKey == "color":
            index = 1
        
        for item in items:
            if item[index] == ruleValue:
                count += 1
        return count