package Algoritm;

import java.util.ArrayDeque;

public class ExitLabirint {

    public void wallsAndGates(int[][] rooms) {
        int GATE = 0;
        int EMPTY = Integer.MAX_VALUE;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[][] steps = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == GATE) {
                    queue.add(new int[] { i, j });
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
                if (newRow >= 0 && newRow < rooms.length && newCol >= 0 && newCol < rooms[0].length &
                        rooms[newRow][newCol] == EMPTY) {
                    rooms[newRow][newCol] = rooms[curRow][curCol] + 1;
                    queue.add(new int[] { newRow, newCol });
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {},
                        {},
                        {},
                        {}};
    }
}
