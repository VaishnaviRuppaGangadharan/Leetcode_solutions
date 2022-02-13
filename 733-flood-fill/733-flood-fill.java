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
        floodFilling(image, r-1, c, Color, newColor);
        floodFilling(image, r , c-1, Color, newColor);
        floodFilling(image, r+1 , c, Color, newColor);
        floodFilling(image, r , c+1, Color, newColor);
    }
}

// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//         int color = image[sr][sc];
//         if(color != newColor)
//             dfschange(image, sr, sc, newColor, color);
//         return image;
//     }
//     public void dfschange(int[][] image, int sr, int sc, int newColor, int orignal){
//         if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] != orignal)
//             return;
//         image[sr][sc] = newColor;
//         dfschange(image, sr + 1, sc, newColor, orignal);
//         dfschange(image, sr - 1, sc, newColor, orignal);
//         dfschange(image, sr, sc + 1, newColor, orignal);
//         dfschange(image, sr, sc - 1, newColor, orignal);
//     }
// }