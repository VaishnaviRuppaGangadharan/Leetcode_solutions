class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_val = 0;
        for(int i=0; i<sentences.length; i++){
             max_val = Math.max(max_val, sentences[i].split(" ").length);
        }
        return max_val;   
    }
}