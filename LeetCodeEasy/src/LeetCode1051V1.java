/**
 * @ClassName: LeetCode1051V1
 * @Description: 高度检查器
 * @Author: ECRZ
 * @Date: 2022/6/13
 */
public class LeetCode1051V1 {
    public static int heightChecker(int[] heights) {
        int[] old = heights.clone();
        int temp = 0;
        int res = 0;
        for (int j = 0; j < heights.length; j++) {
            for (int i = 0; i < heights.length - 1 - j; i++) {
                if (heights[i] > heights[i + 1]) {
                    temp = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (old[i] != heights[i]) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        ;
    }
}
