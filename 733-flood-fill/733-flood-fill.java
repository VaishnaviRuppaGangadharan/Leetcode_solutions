class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int Color = image[sr][sc];
        if(Color!=newColor) floodFilling(image, sr, sc, Color, newColor);
        return image;
    }
    
    public void floodFilling(int[][] image, int r, int c, int Color, int newColor){
        if(r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != Color){
            return ;
        }
        image[r][c] = newColor;
        floodFilling(image, r+1 , c, Color, newColor);
        floodFilling(image, r , c+1, Color, newColor);
        floodFilling(image, r-1, c, Color, newColor);
        floodFilling(image, r , c-1, Color, newColor);
        
    }
}

