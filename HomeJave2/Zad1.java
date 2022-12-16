package HomeJave2;

// Вам будет предоставлена m x nдвоичная матрица grid.Остров-это группа 1"s"(представляющих сушу),соединенных в 
// 4 направлениях (горизонтальном или вертикальном).) Можно предположить, что все четыре края сетки окружены водой.

// Площадь острова - это количество ячеек со значением 1на острове.

// Возвращает максимальную площадь острова вgrid . Если острова нет, вернитесь 0.

public class Zad1 {
    public static void main(String[] args) {
        int[][] arr = { {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

    System.out.println(maxAreaOfIsland(arr));
    }

    static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, trav(i, j, grid));
                }
            }
        }
        return ans;
    }
    static int trav(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + trav(i-1, j, grid) + trav(i, j-1, grid) + trav(i+1, j, grid) + trav(i, j+1, grid);
    }
}
