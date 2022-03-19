class Solution {
    public int maxArea(int[] heights) {
        int maxProd = 0;
		int low = 0;
		int high = heights.length - 1;
		while(low < high) {
			maxProd = Math.max(maxProd, (high-low) * (Math.min(heights[low], heights[high])));
			if(heights[low] < heights[high]) {
				low++;
			}
			else {
				high--;
			}
		}
		return maxProd;
	}
}