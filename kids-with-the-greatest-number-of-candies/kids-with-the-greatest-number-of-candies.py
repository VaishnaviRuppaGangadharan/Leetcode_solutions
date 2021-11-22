class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        array = []
        for candy in candies:
            true_candy_value = candy + extraCandies
            array.append(bool(true_candy_value >= max(candies)))
        return array
        