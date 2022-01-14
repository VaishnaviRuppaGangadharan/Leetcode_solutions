class Solution {
    public void rotate(int[] nums, int k) {
        int[] Array = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            Array[(i+k)%nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = Array[i];
        }
    }
}