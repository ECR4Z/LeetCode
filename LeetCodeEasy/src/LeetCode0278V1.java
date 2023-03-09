/**
 * @ClassName: LeetCode0278V1
 * @Description: 第一个错误的版本
 * @Author: ECRZ
 * @Date: 2022/7/5
 */
public class LeetCode0278V1 {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = (left + right) / 2;

        while (true) {
            // f t
            boolean tagMid = isBadVersion(mid);
            boolean tagLeft = isBadVersion(mid - 1);
            boolean tagRight = isBadVersion(mid + 1);
            if (tagMid) {
                if (!tagLeft) {
                    return mid;
                } else {
                    right = mid - 1;
                    mid = (left + right) / 2;
                }
            }

            // t f
            if (!tagMid) {
                if (tagRight) {
                    return mid + 1;
                } else {
                    left = mid + 1;
                    mid = (left + right) / 2;
                }
            }
        }
    }


    public static int firstBadVersionV2(int n) {
        int left = 1;
        int right = n;
        int mid = (left + right) / 2;

        while (true) {
            // f t
            boolean tagMid = isBadVersion(mid);
            boolean tagLeft = isBadVersion(mid-1);
            boolean tagRight = isBadVersion(mid+1);
            if (tagMid) {
                if (!tagLeft) {
                    return mid;
                } else {
                    right = mid - 1;
                    mid = (left + (right - left)) / 2;
                }
            }

            // t f
            if (!tagMid) {
                if (tagRight) {
                    return mid + 1;
                } else {
                    left = mid + 1;
                    mid = (left + (right - left)) / 2;
                }
            }
        }
    }

    public static boolean isBadVersion(int n) {
        if (n == 1) {
            return true;
        }
        return false;
    }

    // 1 1 0 0 0 0 0 0 0 0
    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }
}
