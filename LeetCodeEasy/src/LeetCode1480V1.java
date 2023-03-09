/**
 * @ClassName: LeetCode1480V1
 * @Description: 一维数组的动态和
 * @Author: ECRZ
 * @Date: 2022/6/29
 */
public class LeetCode1480V1 {
    public static int[] runningSum(int[] nums) {
        int tmp = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = tmp + nums[i];
            tmp = res[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] sa = runningSum(new int[]{1, 2, 3, 4, 5, 6});
        for (int i : sa) {
            System.out.println(i);
        }
    }
}
