class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] outputArray = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length/2; i++){
            outputArray[j] = nums [i];
            outputArray[j+1] = nums[i+n];
            j=j+2;
        }
        return outputArray;
        
    }
}