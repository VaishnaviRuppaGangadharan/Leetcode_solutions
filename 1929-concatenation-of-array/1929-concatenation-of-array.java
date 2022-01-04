class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] outputArray = new int[nums.length*2];
        for(int i=0; i<(nums.length);i++){
            outputArray[i]=nums[i];
            outputArray[nums.length+i]=nums[i];
        }
        return outputArray;
    }
}