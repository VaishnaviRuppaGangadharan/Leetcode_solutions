class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> numsmap1 = new HashMap<> ();
        HashMap <Integer, Integer> numsmap2 = new HashMap<> ();
        List<Integer> Output = new ArrayList<>();
        
        
        for(int i=0; i<nums1.length; i++){
            if(numsmap1.containsKey(nums1[i])){
                numsmap1.put(nums1[i], numsmap1.get(nums1[i])+1);
            }
            else{
                numsmap1.put(nums1[i], 1);
            }
        }
        
        for(int i=0; i<nums2.length; i++){
            if(numsmap2.containsKey(nums2[i])){
                numsmap2.put(nums2[i], numsmap2.get(nums2[i])+1);
            }
            else{
                numsmap2.put(nums2[i], 1);
            }
        }
        
        for(int key: numsmap1.keySet()){
            if(numsmap2.containsKey(key)){
                int min= Math.min(numsmap1.get(key), numsmap2.get(key));
                for(int i=0; i<min; i++){
                    Output.add(key);
                }}
            // else{
            //     numsmap1.remove(key);
            // }
            }
        int[] outputArray = new int[Output.size()];
        for(int i=0; i<Output.size(); i++){
            outputArray[i]=Output.get(i);
        }
         
        return outputArray; 
}
}