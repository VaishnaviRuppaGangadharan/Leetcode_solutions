class Solution {
    public void reverseString(char[] nums) {
        int n = nums.length - 1;
        for(int i=0; i<nums.length/2; i++){
            char temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            n-=1;
        }
    }
}