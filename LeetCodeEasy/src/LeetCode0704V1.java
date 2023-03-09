/**
 * @ClassName: LeetCode0704V1
 * @Description: 二分查找
 * @Author: ECRZ
 * @Date: 2022/7/5
 */
public class LeetCode0704V1 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }

            // 左边
            if (nums[mid] > target) {
                right = mid-1;
                mid = (left + right) / 2;
            }

            // 右边
            if (nums[mid] < target) {
                left = mid+1;
                mid = (left + right) / 2;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},19));
    }
}
