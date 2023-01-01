package HomeJava4;

// Учитывая m x nдвоичную матрицуmat, верните расстояние до ближайшей0 для каждой ячейки.

// Расстояние между двумя соседними ячейками равно 1.

import java.util.ArrayDeque;

public class Labirint {
    public static int[][] updateMatrix(int[][] rooms) {
        int GATE = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[][] ans = new int[rooms.length][rooms[0].length];
        int[][] steps = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == GATE) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] curPoint = queue.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] step : steps) {
                int newRow = curRow + step[0];
                int newCol = curCol + step[1];
                if (newRow >= 0 && newRow < rooms.length && newCol >= 0 && newCol < rooms[0].length &&
                        rooms[newRow][newCol] == 1) {
                    ans[newRow][newCol] = ans[curRow][curCol] + 1;
                    rooms[newRow][newCol] = 2;
                    queue.add(new int[] { newRow, newCol });
                }
            }
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 0, 0},
                                  {1, 1, 0},
                                  {1, 1, 1} };
        
        int[][] array = updateMatrix(arr);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
