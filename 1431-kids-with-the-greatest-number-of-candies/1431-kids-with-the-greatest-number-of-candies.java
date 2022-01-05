class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        List<Boolean> candyArray = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
           maxCandy = Math.max(candies[i], maxCandy);
        }
        
        for(int i=0; i<candies.length; i++){
            if (candies[i] + extraCandies >= maxCandy){
                candyArray.add(true);
            }
            else{
                candyArray.add(false);
            }
        }
            
        return candyArray;
    }
}
