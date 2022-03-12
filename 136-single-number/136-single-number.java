// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap <Integer, Integer> map = new HashMap <Integer, Integer> ();
//         for(int i=0; i<nums.length; i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i], -1);
//             }
//             else{
//                 map.put(nums[i], 1);
//             }
//         }
//         // for(Map.Entry<Integer,Integer> m: map.entrySet()){
//         //     if(m.getValue()==1){
//         //         return m.getKey();
//         //     }
//         // }
//         for(int key: map.keySet()){
//             if(map.get(key)==1){
//                 return key;
//             }
//         }
//         return 0;
//     }
// }

class Solution {
     public int singleNumber(int[] nums) {
         int a  = 0;
         for(int num: nums){
             a = a^num;
         }
         return a;  
     }
}