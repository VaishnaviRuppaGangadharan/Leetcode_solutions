class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int output=0;
        for(int i=0; i<stones.length(); i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                output+=1;
            }
        }
        return output;
    }
}