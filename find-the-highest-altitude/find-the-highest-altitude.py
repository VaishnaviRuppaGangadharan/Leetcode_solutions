class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        new_ele = 0
        new_gain = []
        for element in gain:
            new_ele += element
            new_gain.append(new_ele)
        if max(new_gain) > 0:
            return max(new_gain)
        else:
            return 0
        