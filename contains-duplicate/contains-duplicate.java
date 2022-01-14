class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                answer = true;
                break;
            }
            else{
                map.put(nums[i], 1);
            }
        }
        return answer;
        
    }
}

