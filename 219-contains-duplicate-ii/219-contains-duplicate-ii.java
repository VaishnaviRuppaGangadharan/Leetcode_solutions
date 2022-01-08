class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean answer = false;
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k){
                answer = true;
                break;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return answer; 
    }
}