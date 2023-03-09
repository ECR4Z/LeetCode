/**
 * @EnumName: LeetCode2319V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/31
 * @Notes: TODO
 */
public class LeetCode2319V1 {
    public static void main(String[] args) {
        // 4 / 2 = 2
        int[][] grid = {
                {2, 0, 0, 0, 1},
                {0, 2, 0, 2, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {2, 0, 0, 0, 1}
        };

        // 00 11 22 33 44
        // 04 13 22 31 40
        // n

        System.out.println(checkXMatrix(grid));
    }

    /**
     * @Description: 模拟法
     * @Author: ECRZ
     * @Date: 2023/1/31
     * @Notes: TODO
     */
    public static boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == j && grid[i][j] == 0) {
                    return false;
                }

                if (j == (grid.length - i - 1) && grid[i][j] == 0) {
                    return false;
                }

                if (i != j && j != (grid.length - i - 1) && grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
