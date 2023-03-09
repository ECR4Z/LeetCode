/**
 * @ClassName: LeetCode0070V1
 * @Description: 爬楼梯
 * @Author: ECRZ
 * @Date: 2022/6/27
 */
public class LeetCode0070V1 {
    public static int climbStairs(int n) {
        // fn = fn-1 + fn-2
        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairsV2(int n) {
        if (n==0){
            return 1;
        }

        if (n==1){
            return 1;
        }
        // fn = fn-1 + fn-2
        int n0 = 1;
        int n1 = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = n0 + n1;
            n0 = n1;
            n1 = res;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(climbStairsV2(3));

    }
}
