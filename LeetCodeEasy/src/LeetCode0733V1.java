/**
 * @ClassName: LeetCode0733V1
 * @Description: 图像渲染
 * @Author: ECRZ
 * @Date: 2022/7/8
 */
public class LeetCode0733V1 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // BFS
        int key = image[sr][sc];
        int[][] res = new int[4][2];
        // 下
        if (sr < image.length - 1) {
            int a = sr + 1;
            if (key == image[a][sc]) {
                System.out.printf("x:%d,y:%d\n", a, sc);
            }
        }

        // 右
        if (sc < image[sr].length - 1) {
            int d = sc + 1;
            if (key == image[sr][d]) {
                System.out.printf("x:%d,y:%d\n", sr, d);
            }
        }

        // 上
        if (sr > 0) {
            int b = sr - 1;
            if (key == image[b][sc]) {
                System.out.printf("x:%d,y:%d\n", b, sc);
            }
        }

        // 左
        if (sc > 0) {
            int c = sc - 1;
            if (key == image[sr][c]) {
                System.out.printf("x:%d,y:%d\n", sr, c);
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1},
        };

        int[][] ss = floodFill(arr, 1, 1, 2);

        for (int[] s : ss) {
            for (int i : s) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
