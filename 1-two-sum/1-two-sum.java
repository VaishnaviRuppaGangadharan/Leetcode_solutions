class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                result[0] = map.get(comp);
                result[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}