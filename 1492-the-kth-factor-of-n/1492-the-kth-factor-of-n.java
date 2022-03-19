class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> divList = new ArrayList();
		int sqrtN = (int) Math.sqrt(n);
		for(int i=1; i<sqrtN+1; i++) {
			if(n % i == 0) {
				divList.add(i);
				k--;
			}
				if(k==0) {
					return i;
				}	
		}
        if(sqrtN*sqrtN == n)
			k++;
		if(k<=divList.size()) {
			return n/divList.get(divList.size()-k);
		}
		else {
			return -1;
		}
		
	}
    
}