class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet<>();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char currVal = board[i][j];
                if(currVal != '.'){
                    if(!seen.add(currVal + "found in row" + i) ||
                       !seen.add(currVal + "found in col" + j) ||
                       !seen.add(currVal + "found in box" + i/3 + "-" + j/3)){
                        return false;}
                    }}}
        return true;
    }
}