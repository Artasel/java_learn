package HomeJave2;

public class Zad3 {
    public static void main(String[] args) {
        int[][] arr = { {0, 0, 1, 0},
                        {0, 0, 0, 0},
                        {0, 1, 1, 0},
                        {1, 1, 0, 0},
                        {0, 1, 0, 1},
                        {0, 2, 1, 1},
                        {2, 2, 2, 1},
                        {0, 2, 0, 0} };

                        
        arr = floodFill(arr, 6, 0, 4);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int x = image[sr][sc];
        trav(sr, sc, x, color, image);
        return image;
    }
    static void trav(int i, int j, int x, int color, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != x) {
            return;
        }
        grid[i][j] = color;
        trav(i-1, j,  x, color, grid);
        trav(i, j-1,  x, color, grid);
        trav(i+1, j,  x, color, grid);
        trav(i, j+1,  x, color, grid);
    }
}