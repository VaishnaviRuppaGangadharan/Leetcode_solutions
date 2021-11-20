class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        result = 0
        for acc in accounts:
            result = max(result,sum(acc))
        return result