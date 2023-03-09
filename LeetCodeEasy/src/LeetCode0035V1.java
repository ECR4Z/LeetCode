/**
 * @ClassName: LeetCode0035V1
 * @Description: 搜索插入位置
 * @Author: ECRZ
 * @Date: 2022/6/24
 */
public class LeetCode0035V1 {
    public static int searchInsert(int[] nums, int target) {
        boolean tag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                tag = true;
                return i;
            }
            //System.out.print(nums[i] + " ");
        }

        if (!tag) {
            for (int i = 0; i < nums.length; i++) {
                if (target <= nums[i]) {
                    return i;
                }

                if ((i == nums.length - 1)) {
                    return nums.length;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

}
