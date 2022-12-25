package HomeJava4;

import java.util.ArrayDeque;

// Вам будет предоставлена m x nдвоичная матрица grid.Остров-это группа 1"s"(представляющих сушу),соединенных в 
// 4 направлениях (горизонтальном или вертикальном).) Можно предположить, что все четыре края сетки окружены водой.

// Площадь острова - это количество ячеек со значением 1на острове.

// Возвращает максимальную площадь острова вgrid . Если острова нет, вернитесь 0.

public class Zad1 {

    public static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, trav(i, j, grid));
                }
            }
        }
        return ans;
    }

    static int trav(int i, int j, int[][] grid) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {i, j});
        int[][] steps = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        int ans = 1;
        grid[i][j] = 0;
        while (!queue.isEmpty()) {
            int[] curPoint = queue.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] step : steps) {
                int newRow = curRow + step[0];
                int newCol = curCol + step[1];
                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                        && grid[newRow][newCol] == 1) {
                    queue.add(new int[] {newRow, newCol});
                    grid[newRow][newCol] = 0;
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = { {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

    System.out.println(maxAreaOfIsland(arr));
    }
}
