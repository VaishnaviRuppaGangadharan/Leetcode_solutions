class Solution {
    
    public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>>result = new ArrayList<>();
		Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
        	if((i == 0) || (nums[i] != nums[i-1])) {
        		findComp(nums, i, result);
        	}
        }
        return result;
    }
	public static void findComp(int[] nums, int i, List<List<Integer>> result) {
        HashSet<Integer> seen = new HashSet<>();
		for(int j=i+1; j<nums.length; j++) {
			int comp = -nums[i]-nums[j];
			if(seen.contains(comp)) {
				result.add(Arrays.asList(nums[i],nums[j], comp));
				while (j + 1 < nums.length && nums[j] == nums[j + 1])
				j++;
			}
			seen.add(nums[j]);	
			
		}
		
	}  
    
}