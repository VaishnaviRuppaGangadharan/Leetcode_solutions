class Solution {
    public void sortColors(int[] nums) {
        int index0 = 0;
		int index2 = nums.length -1;
        int i = 0;
		while(i<=index2){
			if(nums[i] == 0) {
				swap(nums, i, index0);
				index0++;
				i++;
			}
			else if(nums[i] == 2) {
				swap(nums, i, index2);
				index2--;
			}
			else {
				i++;
			}
        }
    }
    public void swap(int[] nums, int j, int i) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}
}