class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }    
            else{
                map.put(num, map.get(num) + 1);
                if(map.get(num) > (n/2))
                   {
                       ans = num;
                   }           
            }
        }
        return ans;
    }
}