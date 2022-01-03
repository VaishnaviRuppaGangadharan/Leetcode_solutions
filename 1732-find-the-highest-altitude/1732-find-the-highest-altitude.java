class Solution {
    public int largestAltitude(int[] gain) {
        int maxValue = 0;
        int[] altitudeArray = new int[gain.length+1];
        for(int i=0; i<gain.length; i++){
            altitudeArray[i+1] = gain[i] + altitudeArray[i];
            if (altitudeArray[i+1]>maxValue){
                maxValue = altitudeArray[i+1];
                }
            }
        
        return maxValue;
        
    }
}