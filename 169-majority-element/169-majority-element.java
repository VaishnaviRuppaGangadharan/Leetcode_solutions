// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int ans = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int num: nums){
//             if(!map.containsKey(num)){
//                 map.put(num, 1);
//             }    
//             else{
//                 map.put(num, map.get(num) + 1);
//             }
//             if(map.get(num) > (n/2))
//                {
//                    ans = num;
//                     break;
//                }           
//     }
//         return ans;
//     }
// }

class Solution{
    public int majorityElement(int[] nums){
        int ct = 0;
        Integer major_ele = null;
        for(int num: nums){
            if(ct == 0)
                major_ele = num;
            if(major_ele == num){
                ct+=1;
            } 
            else{
                ct-=1;
            }
                   
        }
        return major_ele;
    }
}