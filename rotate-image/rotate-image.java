class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int N = matrix.length;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }
        
    }
}