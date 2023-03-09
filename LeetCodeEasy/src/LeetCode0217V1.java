/**
 * @ClassName: LeetCode0217V1
 * @Description: 存在重复元素
 * @Author: ECRZ
 * @Date: 2022/6/20
 */
public class LeetCode0217V1 {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] sa = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(sa));
    }
}
