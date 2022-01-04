class Solution {
    public int[] buildArray(int[] nums) {
        int[] buildArray = new int[nums.length]; 
        for(int i=0; i<nums.length; i++){
            buildArray[i] = nums[nums[i]];
        }
        return buildArray;
    }
}