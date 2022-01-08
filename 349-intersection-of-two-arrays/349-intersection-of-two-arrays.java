class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> numset1 = new HashSet <> ();
        ArrayList <Integer> ansSet = new ArrayList<>();
        
        
        for(int i=0; i<nums1.length; i++){
            numset1.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            if (numset1.contains(nums2[j]))
                ansSet.add(nums2[j]);
                numset1.remove(nums2[j]);
        }
        
        int[] answer = new int [ansSet.size()];
        for(int i=0; i<ansSet.size(); i++){
            answer[i] = ansSet.get(i);
        }       
       return answer; 
    }
}