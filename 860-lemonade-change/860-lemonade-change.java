class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int bill: bills) {
			if(bill == 5) {
				if(map.containsKey(bill)) {
					map.put(bill, map.get(bill)+1);
				}
				else {
					map.put(bill, 1);
				}
			}
			else if(bill == 10) {
				if(!map.containsKey(bill)) {
					map.put(bill, 1);
				}
				else {
					map.put(bill, map.get(bill)+1);
				}
				if(map.containsKey(5) && map.get(5)>0) map.put(5, map.get(5) - 1);
				else return false;
			}
			else if(bill == 20) {
				if(!map.containsKey(bill)) {
					map.put(bill, 1);
				}
				else {
					map.put(bill, map.get(bill)+1);
				}
				if(map.containsKey(5) && map.containsKey(10) && map.get(5)>0 && map.get(10)>0) {
					map.put(5, map.get(5) - 1);
					map.put(10, map.get(10) - 1);
				}
                else if(map.containsKey(5) && map.get(5)>=3) map.put(5,map.get(5)-3);
				else return false;
			}
			
		}
		return true;

	}
}