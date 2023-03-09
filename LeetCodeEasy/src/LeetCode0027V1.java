/**
 * @ClassName: LeetCode0027V1
 * @Description: 移除元素
 * @Author: ECRZ
 * @Date: 2022/6/23
 */
public class LeetCode0027V1 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            } else {
                nums[i] = 0;
            }
        }

        int tmp = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums.length; k++) {
                if (nums[j] >= nums[k]) {
                    tmp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] s = new int[]{3, 2, 2, 3};
        removeElement(s, 3);
    }
}
