/**
 * @ClassName: LeetCode0053V1
 * @Description: 最大子数组和
 * @Author: ECRZ
 * @Date: 2022/6/24
 */
public class LeetCode0053V1 {
    public static int maxSubArray(int[] nums) {
        int val = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            val = 0;
            for (int j = i; j < nums.length; j++) {
                val += nums[j];
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    // f(i)=max{f(i−1)+nums[i],nums[i]}
    // f(1) = max(f(0)+nums[1],num[1])
    public static int maxSubArrayV2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArrayV2(new int[]{-1}));
    }
}
