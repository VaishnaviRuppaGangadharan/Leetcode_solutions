class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int smallestWordLength = strs[0].length();
        
        for(int i=1; i<strs.length; i++){
            if (smallestWordLength > strs[i].length()){
                smallestWordLength = strs[i].length();
            }
        }
        
        
        String result = "";
        for(int i=0; i<smallestWordLength; i++){
            char currChar = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(currChar != strs[j].charAt(i)){
                    return result;
                }
            }
            result = result + currChar;

        }
        
        return result;
         
    }
}