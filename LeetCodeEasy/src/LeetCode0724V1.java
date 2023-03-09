/**
 * @ClassName: LeetCode0724V1
 * @Description: 寻找数组的中心下标
 * @Author: ECRZ
 * @Date: 2022/6/29
 */
public class LeetCode0724V1 {
    public static int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int size = 0;
        int countSize = 0;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            size += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            countSize += nums[i];
            if (i == 0) {
                left[i] = 0;
            } else {
                left[i] = countSize - nums[i];
            }

            if (i == nums.length - 1) {
                right[i] = 0;
            } else {
                right[i] = size - countSize;
            }
            //System.out.printf("left:%d,right:%d\n",left[i],right[i]);
        }

        for (int i = 0; i < left.length; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{3, 1, 3}));
    }
}
